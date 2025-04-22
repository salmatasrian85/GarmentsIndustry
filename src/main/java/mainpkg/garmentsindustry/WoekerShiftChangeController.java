package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Objects;

public class WoekerShiftChangeController
{
    @javafx.fxml.FXML
    private ComboBox <String> requestedShiftCombo;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private ComboBox <String> currentShiftCombo;
    @javafx.fxml.FXML
    private TextField workerIdTF;
    @javafx.fxml.FXML
    private Label feedbackLabel;
    @javafx.fxml.FXML
    private TextArea reasonArea;
    @javafx.fxml.FXML
    private Label successfulL;

    @javafx.fxml.FXML
    public void initialize() {
        currentShiftCombo.getItems().addAll("Morning (06:00 AM - 02:00 PM)", "Afternoon (02:00 PM - 10:00 PM)", "Night (10:00 PM - 06:00 AM)");
        requestedShiftCombo.getItems().addAll("Morning (06:00 AM - 02:00 PM)", "Afternoon (02:00 PM - 10:00 PM)", "Night (10:00 PM - 06:00 AM)");
    }

    @javafx.fxml.FXML
    public void submitShiftChangeRequestOA(ActionEvent actionEvent) {
     String name = nameTF.getText();
     String currentShift = currentShiftCombo.getValue();
     String requestedShift = requestedShiftCombo.getValue();
     String reason = reasonArea.getText();
     int workerId = Integer.parseInt(workerIdTF.getText());

     boolean flag = true;
     String error ="";

     if (nameTF.getText().isEmpty()){
         flag = false;
         error +="Name is empty";
     }
     if (workerIdTF.getText().isEmpty()){
         flag = false;
         error +="Id is empty";
     }
     if (currentShiftCombo.getValue()==null || requestedShiftCombo.getValue()==null ){
         flag = false;
         error +="please choose the shift";
     }else if (Objects.equals(currentShiftCombo.getValue(), requestedShiftCombo.getValue())) {
         flag = false;
         error +="please choose different shift";

     }
     feedbackLabel.setText(error);

     if(flag){
         ShiftChange shiftChange = new ShiftChange(name,workerId,currentShift,requestedShift,reason);
         feedbackLabel.setText(shiftChange.toString());
     }

    }
}