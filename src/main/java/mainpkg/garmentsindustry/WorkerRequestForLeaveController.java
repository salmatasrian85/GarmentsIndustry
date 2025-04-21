package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class WorkerRequestForLeaveController
{
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TextArea reasonArea;
    @javafx.fxml.FXML
    private TextField contactField;
    @javafx.fxml.FXML
    private ComboBox<String> leaveTypeCombo;
    @javafx.fxml.FXML
    private TableColumn <LeaveRequest,String>LeaveTypeTC;
    @javafx.fxml.FXML
    private TableColumn <LeaveRequest, LocalDate>EndDateTC;
    @javafx.fxml.FXML
    private TableColumn  <LeaveRequest, LocalDate>StartDateTC;
    @javafx.fxml.FXML
    private TableColumn  <LeaveRequest, String>ReasonTC;
    @javafx.fxml.FXML
    private TableColumn <LeaveRequest,String>ContactInfoTC;

    ArrayList<LeaveRequest> leaveRequestArrayList = new ArrayList<>();
    @javafx.fxml.FXML
    private Label ErrorL;
    @javafx.fxml.FXML
    private TableView <LeaveRequest>LeaveReqTV;


    @javafx.fxml.FXML
    public void initialize() {
        leaveTypeCombo.getItems().addAll("Casual Leave", "Sick Leave", "Maternity Leave", "Festival Leave", "Emergency Leave","Other (Specify in Reason)");

        LeaveTypeTC.setCellValueFactory(new PropertyValueFactory<>("leaveType"));
        StartDateTC.setCellValueFactory(new PropertyValueFactory<>("startDate"));
       EndDateTC.setCellValueFactory(new PropertyValueFactory<>("EndDate"));
        ContactInfoTC.setCellValueFactory(new PropertyValueFactory<>("contactinfo"));
        ReasonTC.setCellValueFactory(new PropertyValueFactory<>("reason"));
    }

    @javafx.fxml.FXML
    public void uploadBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitBtnOA(ActionEvent actionEvent) {
        String leaveType = leaveTypeCombo.getValue();
        LocalDate startDate = startDatePicker.getValue();
        LocalDate endDate = endDatePicker.getValue();
        String contactinfo = contactField.getText();
        String reason = reasonArea.getText();

        String error = "";
        boolean flag = true;

        if (leaveType.isEmpty()) {
            flag = false;
            error += "Leave type is required.\n";
        }
        if (startDate == null) {
            flag = false;
            error += "Start date is required.\n";
        }else if (startDatePicker.getValue().isBefore(LocalDate.now())) {
            error += "date is past.\n" ;
        }
        if (endDate == null) {
            flag = false;
            error += "End date is required.\n";
        }else if (endDatePicker.getValue().isBefore(LocalDate.now())) {
            flag = false ;
            error += "date is past.\n" ;
        }
        if (contactinfo.isEmpty()) {
            flag = false;
            error += "Contact info is required.\n";

        }
        ErrorL.setText(error);

        if (flag){
            LeaveRequest leaveRequest = new LeaveRequest(leaveType,startDate,endDate,contactinfo,reason);
            leaveRequestArrayList.add(leaveRequest);
            leaveTypeCombo.setValue("");
            startDatePicker.setValue(null);
            endDatePicker.setValue(null);
            contactField.setText("");
            reasonArea.setText("");
            LeaveReqTV.getItems().clear();
            LeaveReqTV.getItems().add(leaveRequest);
        }

    }
}