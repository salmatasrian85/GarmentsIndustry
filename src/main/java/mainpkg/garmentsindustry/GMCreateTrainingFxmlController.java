package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class GMCreateTrainingFxmlController
{
    @FXML
    private TextField titleTextField;
    @FXML
    private ComboBox <String>timeCombo;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField descriptionTextField;
    @FXML
    private Label ErrorL;
    @FXML
    private ComboBox <Integer>maxParticipantsCombo;

    @FXML
    public void initialize() {
        timeCombo.getItems().addAll("Morning (06:00 AM - 02:00 PM)", "Afternoon (02:00 PM - 10:00 PM)", "Night (10:00 PM - 06:00 AM)");
        maxParticipantsCombo.getItems().addAll(10,20,30,40,50,60,70,80,90,100);
    }

    @FXML
    public void backToDashboardButtonOA(ActionEvent actionEvent) {
    }

    @FXML
    public void createProgrammeButtonOA(ActionEvent actionEvent) {
        String title = titleTextField.getText();
        String time = timeCombo.getValue();

        int maxParticipants = maxParticipantsCombo.getValue();
        LocalDate date = datePicker.getValue();
        String error = "" ;
        boolean flag = true;
        String description = descriptionTextField.getText();

        if (titleTextField.getText().isEmpty() ||maxParticipantsCombo.getValue()==null||timeCombo.getValue()==null||datePicker.getValue()==null){
            flag = false;
            error += "fill all the field!";
        } else if (datePicker.getValue().isBefore(LocalDate.now())) {
            flag = false;
            error += "fill all the field!";
        }
        ErrorL.setText(error);
        if(flag){
            TrainingProgCreate trainingProgCreate = new TrainingProgCreate(title, description, date, time, maxParticipants);
            ErrorL.setText(trainingProgCreate.toString());
        }

    }
}