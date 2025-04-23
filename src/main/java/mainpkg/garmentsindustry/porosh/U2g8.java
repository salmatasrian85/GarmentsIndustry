package mainpkg.garmentsindustry.porosh;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U2g8 {

    @FXML private TextField WorkerIdTF;
    @FXML private TextField ComplaintIDTF;
    @FXML private TextField WorkerNameTF;
    @FXML private TextField DepartmentTC;
    @FXML private TextField TypeofComplaintTF;

    @FXML private TableView<Grievance> grievanceTable;
    @FXML private TableColumn<Grievance, String> WorkerIdTC;
    @FXML private TableColumn<Grievance, String> complainIDTC;
    @FXML private TableColumn<Grievance, String> WorkerNameTC;
    @FXML private TableColumn<Grievance, String> DepartmentTCCol;
    @FXML private TableColumn<Grievance, String> TypeofComplaintTC;

    private final ObservableList<Grievance> grievanceList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Link table columns to Grievance properties
        WorkerIdTC.setCellValueFactory(data -> data.getValue().workerIdProperty());
        complainIDTC.setCellValueFactory(data -> data.getValue().complaintIdProperty());
        WorkerNameTC.setCellValueFactory(data -> data.getValue().workerNameProperty());
        DepartmentTCCol.setCellValueFactory(data -> data.getValue().departmentProperty());
        TypeofComplaintTC.setCellValueFactory(data -> data.getValue().typeOfComplaintProperty());

        grievanceTable.setItems(grievanceList);
    }

    @FXML
    private void submitOnActionButton() {
        String workerId = WorkerIdTF.getText();
        String complaintId = ComplaintIDTF.getText();
        String name = WorkerNameTF.getText();
        String department = DepartmentTC.getText();
        String complaintType = TypeofComplaintTF.getText();

        if (workerId.isEmpty() || complaintId.isEmpty() || name.isEmpty() || department.isEmpty() || complaintType.isEmpty()) {
            showAlert("All fields must be filled out.");
            return;
        }

        grievanceList.add(new Grievance(workerId, complaintId, name, department, complaintType));

        clearFields();
        showAlert("Complaint successfully submitted!");
    }

    private void clearFields() {
        WorkerIdTF.clear();
        ComplaintIDTF.clear();
        WorkerNameTF.clear();
        DepartmentTC.clear();
        TypeofComplaintTF.clear();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Grievance Tracker");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
