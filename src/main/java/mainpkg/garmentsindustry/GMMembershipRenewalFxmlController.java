package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class GMMembershipRenewalFxmlController
{
    @javafx.fxml.FXML
    private DatePicker renewalDatePicker;
    @javafx.fxml.FXML
    private TableView <Renewal>renewTV;
    @javafx.fxml.FXML
    private TextField memberIdTextField;
    @javafx.fxml.FXML
    private TableColumn <Renewal,String>durationTC;
    @javafx.fxml.FXML
    private TableColumn<Renewal,String >nameTC;
    @javafx.fxml.FXML
    private TextField fullNameTextField;
    @javafx.fxml.FXML
    private TableColumn <Renewal, LocalDate>dateTC;
    @javafx.fxml.FXML
    private Label ErrorL;
    @javafx.fxml.FXML
    private ComboBox <String>durationCombo;
    @javafx.fxml.FXML
    private TableColumn <Renewal,String>memberIdTC;

    ArrayList<Renewal> renewalArrayList = new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {
        durationCombo.getItems().addAll("1 year","3 year","4 year");

        nameTC.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        memberIdTC.setCellValueFactory(new PropertyValueFactory<>("memberId"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("renewalDate"));
        durationTC.setCellValueFactory(new PropertyValueFactory<>("duration"));

    }

    @javafx.fxml.FXML
    public void submitRenewalButtonOA(ActionEvent actionEvent) {
        String memberId = memberIdTextField.getText();
        String fullName = fullNameTextField.getText();;
        LocalDate renewalDate = renewalDatePicker.getValue();;
        String duration = durationCombo.getValue();
        boolean flag = true;
        String error = "";
        if(memberIdTextField.getText().isEmpty()||memberIdTextField.getText().isEmpty()||durationCombo.getValue()==null){
            flag = false;
            error += "fill alll the field";
        }else if(renewalDatePicker.getValue().isBefore(LocalDate.now())){
            error+= "date is past";
        }
        if (flag){
            error+="Submitted SucccessFully";

            Renewal renewal = new Renewal(memberId,fullName,renewalDate,duration);
            renewalArrayList.add(renewal);
            renewTV.getItems().clear();
            renewTV.getItems().addAll(renewalArrayList);

        }
    }


    @javafx.fxml.FXML
    public void backToDashboardButtonOA(ActionEvent actionEvent) {
    }
}