package mainpkg.garmentsindustry.porosh;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class U2g1 {

    @FXML private TextField WorkerIDTF;
    @FXML private TextField WorkerNameTF;
    @FXML private DatePicker AttendaanceDateDatePicker;
    @FXML private TableView<WorkerAttendance> tableView;
    @FXML private TableColumn<WorkerAttendance, String> WorkerIDTC;
    @FXML private TableColumn<WorkerAttendance, String> WorkerName;
    @FXML private TableColumn<WorkerAttendance, LocalDate> AttendanceDateTC;
    @FXML private Label errorMESSAGELabel;

    private ObservableList<WorkerAttendance> attendanceList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        WorkerIDTC.setCellValueFactory(new PropertyValueFactory<>("workerID"));
        WorkerName.setCellValueFactory(new PropertyValueFactory<>("workerName"));
        AttendanceDateTC.setCellValueFactory(new PropertyValueFactory<>("attendanceDate"));

        tableView.setItems(attendanceList);
    }

    @FXML
    private void SubmitAttendanceButtonOA() {
        String id = WorkerIDTF.getText();
        String name = WorkerNameTF.getText();
        LocalDate date = AttendaanceDateDatePicker.getValue();

        if (id.isEmpty() || name.isEmpty() || date == null) {
            errorMESSAGELabel.setText("Please fill all fields.");
            return;
        }

        WorkerAttendance record = new WorkerAttendance(id, name, date);
        attendanceList.add(record);
        errorMESSAGELabel.setText("Attendance submitted successfully.");
        clearFields();
    }

    @FXML
    private void DashboardOnActionButton() {
        System.out.println("Dashboard clicked.");
        // Navigation logic goes here
    }

    private void clearFields() {
        WorkerIDTF.clear();
        WorkerNameTF.clear();
        AttendaanceDateDatePicker.setValue(null);
    }
}
