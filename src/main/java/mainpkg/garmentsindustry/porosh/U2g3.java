package mainpkg.garmentsindustry.porosh;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class U2g3 {

    @FXML private ComboBox<String> IncidentTypeCombobox;
    @FXML private TextField IncidentLocationTextfield;
    @FXML private DatePicker DateOfIncidentDatePicker;
    @FXML private TextArea DescriptionOfIncidentTextArea;
    @FXML private Label ErrorMassageLabel;

    @FXML private TableView<SafetyIncident> tableView;
    @FXML private TableColumn<SafetyIncident, String> IncidentTypeTableview;
    @FXML private TableColumn<SafetyIncident, String> IncidentLocationTablecolumn;
    @FXML private TableColumn<SafetyIncident, LocalDate> DateOfIncidentTablecolumn;
    @FXML private TableColumn<SafetyIncident, String> DescriptionOfIncidentTablecolumn;

    private ObservableList<SafetyIncident> incidentList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Set table column bindings
        IncidentTypeTableview.setCellValueFactory(new PropertyValueFactory<>("incidentType"));
        IncidentLocationTablecolumn.setCellValueFactory(new PropertyValueFactory<>("incidentLocation"));
        DateOfIncidentTablecolumn.setCellValueFactory(new PropertyValueFactory<>("dateOfIncident"));
        DescriptionOfIncidentTablecolumn.setCellValueFactory(new PropertyValueFactory<>("description"));

        tableView.setItems(incidentList);

        // Populate ComboBox
        IncidentTypeCombobox.setItems(FXCollections.observableArrayList(
                "Fire", "Injury", "Equipment Failure", "Chemical Spill", "Other"
        ));
    }

    @FXML
    private void SaveButton() {
        String type = IncidentTypeCombobox.getValue();
        String location = IncidentLocationTextfield.getText();
        LocalDate date = DateOfIncidentDatePicker.getValue();
        String description = DescriptionOfIncidentTextArea.getText();

        if (type == null || location.isEmpty() || date == null || description.isEmpty()) {
            ErrorMassageLabel.setText("Please fill in all fields.");
            return;
        }

        SafetyIncident incident = new SafetyIncident(type, location, date, description);
        incidentList.add(incident);
        ErrorMassageLabel.setText("Incident reported successfully.");
        clearFields();
    }

    @FXML
    private void DashboardOnActionButton() {
        System.out.println("Navigating to Dashboard...");
        // Navigation logic here
    }

    private void clearFields() {
        IncidentTypeCombobox.getSelectionModel().clearSelection();
        IncidentLocationTextfield.clear();
        DateOfIncidentDatePicker.setValue(null);
        DescriptionOfIncidentTextArea.clear();
    }
}
