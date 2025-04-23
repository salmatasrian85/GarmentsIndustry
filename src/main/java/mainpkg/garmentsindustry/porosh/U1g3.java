package mainpkg.garmentsindustry.porosh;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class U1g3 {

    @FXML private DatePicker MeetingDateDP;
    @FXML private TextField TimeTF, AgendaTitleTF;
    @FXML private ComboBox<String> stakeholdersComboBox;
    @FXML private RadioButton MeetingModeOfflineRB;
    @FXML private RadioButton MeetingModeOnlineRB;
    @FXML private TableView<PolicyReviewMeeting> tableView;
    @FXML private TableColumn<PolicyReviewMeeting, LocalDate> MeetingDateTC;
    @FXML private TableColumn<PolicyReviewMeeting, String> TimeTC, StakeholdersTC, MeetingModeTC, AgendaTitleTC;
    @FXML private Label errormassagelabel;

    private ObservableList<PolicyReviewMeeting> meetingList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        ToggleGroup meetingModeGroup = new ToggleGroup();
        MeetingModeOnlineRB.setToggleGroup(meetingModeGroup);
        MeetingModeOfflineRB.setToggleGroup(meetingModeGroup);

        // Sample stakeholders for dropdown
        stakeholdersComboBox.setItems(FXCollections.observableArrayList(
                "Management", "HR", "Finance", "Operations", "All Departments"
        ));

        // TableView bindings
        MeetingDateTC.setCellValueFactory(cell -> new javafx.beans.property.SimpleObjectProperty<>(cell.getValue().getMeetingDate()));
        TimeTC.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getTime()));
        StakeholdersTC.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getStakeholders()));
        MeetingModeTC.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getMeetingMode()));
        AgendaTitleTC.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getAgendaTitle()));

        tableView.setItems(meetingList);
    }

    @FXML
    private void submitONactionB() {
        try {
            LocalDate date = MeetingDateDP.getValue();
            String time = TimeTF.getText();
            String stakeholders = stakeholdersComboBox.getValue();
            String mode = MeetingModeOnlineRB.isSelected() ? "Online" :
                    MeetingModeOfflineRB.isSelected() ? "Offline" : "Not Selected";
            String agenda = AgendaTitleTF.getText();

            if (date == null || time.isEmpty() || stakeholders == null || agenda.isEmpty() || mode.equals("Not Selected")) {
                errormassagelabel.setText("Please fill all required fields.");
                return;
            }

            PolicyReviewMeeting newMeeting = new PolicyReviewMeeting(date, time, stakeholders, mode, agenda);
            meetingList.add(newMeeting);
            clearFields();
            errormassagelabel.setText("Meeting scheduled successfully.");

        } catch (Exception e) {
            errormassagelabel.setText("Error: " + e.getMessage());
        }
    }

    @FXML
    private void DashboardOnActionButton() {
        System.out.println("Navigating to Dashboard...");
        // Implement scene switching here if needed
    }

    private void clearFields() {
        MeetingDateDP.setValue(null);
        TimeTF.clear();
        AgendaTitleTF.clear();
        stakeholdersComboBox.getSelectionModel().clearSelection();
        MeetingModeOnlineRB.setSelected(false);
        MeetingModeOfflineRB.setSelected(false);
    }
}
