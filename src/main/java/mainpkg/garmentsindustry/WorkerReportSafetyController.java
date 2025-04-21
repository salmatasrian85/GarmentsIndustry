package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class WorkerReportSafetyController
{
    @FXML
    private TextField issueTitleTF;
    @FXML
    private TextField nameTF;
    @FXML
    private ComboBox <String> departmentCombo;
    @FXML
    private TextArea descriptionTextArea;
    @FXML
    private TextField workeridTF;
    @FXML
    private DatePicker ObservedDP;
    @FXML
    private ComboBox <String> severityComboBox;
    @FXML
    private Label ErrorL;
    @FXML
    private TextField locationTF;

    @FXML
    public void initialize() {
        departmentCombo.getItems().addAll("Production","Maintenance","Quality Control","Logistics","Administration");
        severityComboBox.getItems().addAll("Low","Moderate","High","Critical");
    }

    @FXML
    public void submitReportButtonOA(ActionEvent actionEvent) {
        String workerName = "", department = "", issueTitle = "", location = "", description = "", severity = "", error = "";
        int workerId = 0;
        LocalDate dateObserved = null;
        boolean flag = true;

        if (nameTF.getText().isEmpty()) {
            flag = false;
            error += "Name is empty.\n";
        } else {
            workerName = nameTF.getText();
        }

        if (workeridTF.getText().isEmpty()) {
            flag = false;
            error += "ID is empty.\n";
        } else {
            try {
                workerId = Integer.parseInt(workeridTF.getText());
            } catch (NumberFormatException e) {
                flag = false;
                error += "ID must be a number.\n";
            }
        }

        if (departmentCombo.getValue() == null || departmentCombo.getValue().isEmpty()) {
            flag = false;
            error += "Department is not selected.\n";
        } else {
            department = departmentCombo.getValue();
        }

        if (issueTitleTF.getText().isEmpty()) {
            flag = false;
            error += "Issue title is empty.\n";
        } else {
            issueTitle = issueTitleTF.getText();
        }

        if (ObservedDP.getValue() == null) {
            flag = false;
            error += "Date observed is not selected.\n";
        } else {
            dateObserved = ObservedDP.getValue();
        }

        if (locationTF.getText().isEmpty()) {
            flag = false;
            error += "Location is empty.\n";
        } else {
            location = locationTF.getText();
        }

        if (descriptionTextArea.getText().isEmpty()) {
            flag = false;
            error += "Description is empty.\n";
        } else {
            description = descriptionTextArea.getText();
        }


        if (severityComboBox.getValue() == null || severityComboBox.getValue().isEmpty()) {
            flag = false;
            error += "Severity is not selected.\n";
        } else {
            severity = severityComboBox.getValue();
        }
        ErrorL.setText((error));

        if(flag){
            ReportSafetyProblem reportSafetyProblem = new ReportSafetyProblem(workerName,workerId,department,issueTitle,dateObserved,location,description,severity);

            ErrorL.setText(reportSafetyProblem.toString());
        }
    }
    @FXML
    public void clearForm(ActionEvent actionEvent) {
        nameTF.setText("");
        workeridTF.setText("");
        departmentCombo.setValue(null);
        issueTitleTF.setText("");
        ObservedDP.setValue(null);
        locationTF.setText("");
        descriptionTextArea.setText("");
        severityComboBox.setValue(null);
        ErrorL.setText("");
    }
}