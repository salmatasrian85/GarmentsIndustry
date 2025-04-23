package mainpkg.garmentsindustry.porosh;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class U2g7 {

    @FXML private TextField FeedbackTitle;
    @FXML private TextArea FeedbackMessageTA;
    @FXML private ComboBox<String> TagWelfareProgramCB;
    @FXML private TextField TicketIDTF;
    @FXML private TextField ProgramTF;
    @FXML private TextField StatusTF;
    @FXML private TextField LastUpdatedTF;

    @FXML
    public void initialize() {
        // Example programs
        TagWelfareProgramCB.setItems(FXCollections.observableArrayList(
                "Health Camp", "Skill Training", "Subsidized Meals", "Education Support"
        ));
    }

    @FXML
    private void SendFeedbackOnActionButton() {
        String title = FeedbackTitle.getText();
        String message = FeedbackMessageTA.getText();
        String program = TagWelfareProgramCB.getValue();

        if (title.isEmpty() || message.isEmpty() || program == null) {
            showAlert("Please complete all fields before submitting.");
            return;
        }

        String ticketID = "FB-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        LocalDateTime now = LocalDateTime.now();
        String status = "Received";
        String formattedDate = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        // Displaying feedback ticket info
        TicketIDTF.setText(ticketID);
        ProgramTF.setText(program);
        StatusTF.setText(status);
        LastUpdatedTF.setText(formattedDate);

        showAlert("Feedback submitted successfully!\nTicket ID: " + ticketID);

        clearInputs();
    }

    @FXML
    private void DashboardOnActionButton() {
        System.out.println("Navigating to Dashboard...");
        // Navigation logic goes here
    }

    private void clearInputs() {
        FeedbackTitle.clear();
        FeedbackMessageTA.clear();
        TagWelfareProgramCB.getSelectionModel().clearSelection();
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Feedback Submission");
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
