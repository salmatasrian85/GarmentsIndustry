package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class WorkerTraingProgrammeFxmlController
{
    @javafx.fxml.FXML
    private ComboBox <String>timeCombo;
    @javafx.fxml.FXML
    private TableColumn <TrainingProgramme,String>nameTC;
    @javafx.fxml.FXML
    private CheckBox cuurenWorkCB;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TableColumn<TrainingProgramme, LocalDate> dateTC;
    @javafx.fxml.FXML
    private ComboBox <String>trainingCombo;
    @javafx.fxml.FXML
    private TableColumn <TrainingProgramme,String>timeTC;
    @javafx.fxml.FXML
    private Button registerButton;
    @javafx.fxml.FXML
    private Button TrainingsCombFilter;
    @javafx.fxml.FXML
    private TableView <TrainingProgramme>trainingTable;
    @javafx.fxml.FXML
    private DatePicker preferredDatePicker;
    @javafx.fxml.FXML
    private TableColumn <TrainingProgramme,String>trainingTC;
    @javafx.fxml.FXML
    private ComboBox <String>TrainingsComboFilter;
    @javafx.fxml.FXML
    private Label errorLabel;
    ArrayList<TrainingProgramme> trainingProgrammeList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        trainingCombo.getItems().addAll("Fire Safety", "Machine Operation", "First Aid", "Workplace Hygiene", "Leadership Skills");
        TrainingsComboFilter.getItems().addAll("Fire Safety", "Machine Operation", "First Aid", "Workplace Hygiene", "Leadership Skills");
        timeCombo.getItems().addAll("08:00 AM - 09:00 AM", "09:00 AM - 10:00 AM", "10:00 AM - 11:00 AM", "11:00 AM - 12:00 PM");

        nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        trainingTC.setCellValueFactory(new PropertyValueFactory<>("trainingType"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("preferredDate"));
        timeTC.setCellValueFactory(new PropertyValueFactory<>("time"));
    }

    @javafx.fxml.FXML
    public void registerTrainingOA(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String trainingType = trainingCombo.getValue();
        String time = timeCombo.getValue();
        LocalDate preferredDate = preferredDatePicker.getValue();
        boolean currentlyWorking = cuurenWorkCB.isSelected();

        String error = "";
        boolean flag = true;

        if (nameTextField.getText().isEmpty()) {
            error += "Name is required.\n";
            flag = false;
        }
        if (trainingCombo.getValue() == null) {
            error += "Select a training type.\n";
            flag = false;
        }

        if (timeCombo.getValue() == null) {
            error += "Select a time slot.\n";
            flag = false;
        }

        if (preferredDatePicker.getValue() == null) {
            error += "Select a preferred date.\n";
            flag = false;
        } else if (preferredDate.isBefore(LocalDate.now())) {
            error += "Preferred date cannot be in the past.\n";
            flag = false;
        }

        if (!currentlyWorking) {
            error += "Only currently employed workers can register.\n";
            flag = false;
        }

        errorLabel.setText(error);

        if (flag){
            TrainingProgramme tp = new TrainingProgramme(name, trainingType, preferredDate, time, currentlyWorking);
            trainingProgrammeList.add(tp);

            trainingTable.getItems().clear();
            trainingTable.getItems().addAll(trainingProgrammeList);

            // Clear form
            nameTextField.clear();
            trainingCombo.setValue(null);
            timeCombo.setValue(null);
            preferredDatePicker.setValue(null);
            cuurenWorkCB.setSelected(false);
            errorLabel.setText("");
        }

    }

    @javafx.fxml.FXML
    public void filterButtonOA(ActionEvent actionEvent) {
    }
}