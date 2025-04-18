package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class WorkerRequestForLeaveController
{
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private DatePicker leaveEndDateDP;
    @javafx.fxml.FXML
    private DatePicker leavestartDateDP;
    @javafx.fxml.FXML
    private TextField ageTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backToWrokerDashButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkerMainDasbaordFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("WorkerMainDasbaord");

        stage.setScene(scene);
        stage.show();
    }

    @Deprecated
    public void saveOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void requestButtonOA(ActionEvent actionEvent) {
    }
}