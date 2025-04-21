package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;

public class WorkerMyProfileController
{
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField ageTextField;
    @FXML
    private Label OutputLabel;
    @FXML
    private Label popupL;
    @FXML
    private ToggleGroup genderToggleGroup;
    @FXML
    private RadioButton otherRadoButtton;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton FemaleRadioButton;

    @FXML
    public void initialize() {
    }

    @FXML
    public void backToWrokerDashButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkerMainDasbaordFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("WorkerMainDasbaord");

        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void saveButtonOA(ActionEvent actionEvent) {
        String workerName = nameTextField.getText();
        int age= Integer.parseInt(ageTextField.getText());

        int phoneNumber= Integer.parseInt(phoneNumberTextField.getText() );
        String address =addressTextField.getText();
        String gender = "";
         if(maleRadioButton.isSelected()){
             gender = maleRadioButton.getText();
         } else if (FemaleRadioButton.isSelected()) {
             gender = FemaleRadioButton.getText();
        }else if (otherRadoButtton.isSelected()) {
             gender = otherRadoButtton.getText();
         }
        popupL.setText("Saved Successfullly");
         WorkerProfile workerProfile = new WorkerProfile(workerName,age,gender,phoneNumber,address);
         OutputLabel.setText(workerProfile.toString());


    }
}