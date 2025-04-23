package mainpkg.garmentsindustry.porosh;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class U2g5 {

    @FXML private TextField WorkerIDTF;
    @FXML private TextField NameTF;
    @FXML private ComboBox<String> Departmentcombobox;
    @FXML private TextField ProgramNameTF;
    @FXML private DatePicker EnrolledDateDatepicker;
    @FXML private Label Errormessagelabel;

    @FXML private TableView<WelfareParticipation> tableView;
    @FXML private TableColumn<WelfareParticipation, String> WorkeridTablecolumn;
    @FXML private TableColumn<WelfareParticipation, String> Nametablecolumn;
    @FXML private TableColumn<WelfareParticipation, String> DepartmentTablecolumn;
    @FXML private TableColumn<WelfareParticipation, String> ProgramnameTablecolumn;
    @FXML private TableColumn<WelfareParticipation, LocalDate> EnrolledDateTablecolumn;

    private ObservableList<WelfareParticipation> dataList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Table bindings
        WorkeridTablecolumn.setCellValueFactory(new PropertyValueFactory<>("workerId"));
        Nametablecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        DepartmentTablecolumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        ProgramnameTablecolumn.setCellValueFactory(new PropertyValueFactory<>("programName"));
        EnrolledDateTablecolumn.setCellValueFactory(new PropertyValueFactory<>("enrolledDate"));

        tableView.setItems(dataList);

        // Sample departments
        Departmentcombobox.setItems(FXCollections.observableArrayList(
                "Production", "Quality Control", "HR", "Maintenance", "Logistics"
        ));
    }

    @FXML
    private void Submitonaction() {
        String workerId = WorkerIDTF.getText();
        String name = NameTF.getText();
        String department = Departmentcombobox.getValue();
        String programName = ProgramNameTF.getText();
        LocalDate enrolledDate = EnrolledDateDatepicker.getValue();

        if (workerId.isEmpty() || name.isEmpty() || department == null || programName.isEmpty() || enrolledDate == null) {
            Errormessagelabel.setText("Please fill in all fields.");
            return;
        }

        WelfareParticipation entry = new WelfareParticipation(workerId, name, department, programName, enrolledDate);
        dataList.add(entry);

        Errormessagelabel.setText("Successfully added.");
        clearFields();
    }

    @FXML
    private void DashboardOnActionButton() {
        System.out.println("Navigating to Dashboard...");
        // Navigation logic goes here
    }

    private void clearFields() {
        WorkerIDTF.clear();
        NameTF.clear();
        Departmentcombobox.getSelectionModel().clearSelection();
        ProgramNameTF.clear();
        EnrolledDateDatepicker.setValue(null);
    }
}
