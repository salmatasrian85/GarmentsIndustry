package mainpkg.garmentsindustry.porosh;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class U1g7 {

    @FXML private TextField AnnouncementTitleTF, RecipientName;
    @FXML private ComboBox<String> SelectAudienceCB, SelectAudienceCB1;
    @FXML private DatePicker ScheduleDateDP;
    @FXML private RadioButton seenYesRadioButton, SeenNoRadioButton;
    @FXML private TableView<BroadcastMessage> tableView;
    @FXML private TableColumn<BroadcastMessage, String> AnnouncementTitleTC, SelectAudienceTC, RecipientNameTC, DepartmentTC;
    @FXML private TableColumn<BroadcastMessage, String> ScheduleDateTC;
    @FXML private TableColumn<BroadcastMessage, Boolean> SeenTC;

    private ObservableList<BroadcastMessage> messageList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        ToggleGroup seenGroup = new ToggleGroup();
        seenYesRadioButton.setToggleGroup(seenGroup);
        SeenNoRadioButton.setToggleGroup(seenGroup);

        // Sample combo box options
        SelectAudienceCB.setItems(FXCollections.observableArrayList("All", "Management", "Staff"));
        SelectAudienceCB1.setItems(FXCollections.observableArrayList("HR", "Finance", "IT", "Production"));

        // TableView bindings
        AnnouncementTitleTC.setCellValueFactory(new PropertyValueFactory<>("announcementTitle"));
        SelectAudienceTC.setCellValueFactory(new PropertyValueFactory<>("audience"));
        ScheduleDateTC.setCellValueFactory(new PropertyValueFactory<>("scheduleDate"));
        RecipientNameTC.setCellValueFactory(new PropertyValueFactory<>("recipientName"));
        DepartmentTC.setCellValueFactory(new PropertyValueFactory<>("department"));
        SeenTC.setCellValueFactory(new PropertyValueFactory<>("seen"));

        tableView.setItems(messageList);
    }

    @FXML
    private void SubmitOnActionButton() {
        String title = AnnouncementTitleTF.getText();
        String audience = SelectAudienceCB.getValue();
        String department = SelectAudienceCB1.getValue();
        String recipient = RecipientName.getText();
        boolean seen = seenYesRadioButton.isSelected();
        LocalDate date = ScheduleDateDP.getValue();

        if (title.isEmpty() || audience == null || department == null || recipient.isEmpty() || date == null) {
            showAlert("Please fill in all required fields.");
            return;
        }

        BroadcastMessage message = new BroadcastMessage(title, audience, date, recipient, department, seen);
        messageList.add(message);
        clearFields();
    }

    @FXML
    private void DashboardOnActionButton() {
        System.out.println("Dashboard button clicked.");
        // Implement scene change or logic here
    }

    private void clearFields() {
        AnnouncementTitleTF.clear();
        SelectAudienceCB.getSelectionModel().clearSelection();
        SelectAudienceCB1.getSelectionModel().clearSelection();
        ScheduleDateDP.setValue(null);
        RecipientName.clear();
        seenYesRadioButton.setSelected(false);
        SeenNoRadioButton.setSelected(false);
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Input Error");
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
