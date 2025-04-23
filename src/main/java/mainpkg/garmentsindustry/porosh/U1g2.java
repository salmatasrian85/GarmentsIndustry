package mainpkg.garmentsindustry.porosh;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class U1g2 {

    @FXML private TextField RequestIDTF, DepartmentTF, DescriptionTF, ProposedBudgetTF, CurrentFundAvailableTF, AmountTF;
    @FXML private DatePicker SubmissionDateDP;
    @FXML private TableView<WelfareBudgetRequest> tableView;
    @FXML private TableColumn<WelfareBudgetRequest, String> RequestIDTC, DepartmentTC, DepartmentTC1;
    @FXML private TableColumn<WelfareBudgetRequest, LocalDate> SubmissionDateTC;
    @FXML private TableColumn<WelfareBudgetRequest, String> SubmissionDateTC1, SubmissionDateTC11, SubmissionDateTC111;
    @FXML private Label ErrormassageLabel;

    private ObservableList<WelfareBudgetRequest> requestList = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        // Bind table columns
        RequestIDTC.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getRequestId()));
        DepartmentTC.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getDepartment()));
        DepartmentTC1.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getAmount()));
        SubmissionDateTC.setCellValueFactory(cell -> new javafx.beans.property.SimpleObjectProperty<>(cell.getValue().getSubmissionDate()));
        SubmissionDateTC1.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getDescription()));
        SubmissionDateTC11.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getProposedBudget()));
        SubmissionDateTC111.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getCurrentFundAvailable()));

        tableView.setItems(requestList);
    }

    @FXML
    private void SubmitDecisionOnActionButton() {
        try {
            WelfareBudgetRequest request = new WelfareBudgetRequest(
                    RequestIDTF.getText(),
                    DepartmentTF.getText(),
                    AmountTF.getText(),
                    SubmissionDateDP.getValue(),
                    DescriptionTF.getText(),
                    ProposedBudgetTF.getText(),
                    CurrentFundAvailableTF.getText()
            );

            requestList.add(request);
            clearFields();
            ErrormassageLabel.setText("Submitted successfully.");
        } catch (Exception e) {
            ErrormassageLabel.setText("Error: " + e.getMessage());
        }
    }

    @FXML
    private void DashboardOnActionButton() {
        // Handle dashboard navigation logic
        System.out.println("Dashboard button clicked");
    }

    private void clearFields() {
        RequestIDTF.clear();
        DepartmentTF.clear();
        DescriptionTF.clear();
        ProposedBudgetTF.clear();
        CurrentFundAvailableTF.clear();
        AmountTF.clear();
        SubmissionDateDP.setValue(null);
    }
}
