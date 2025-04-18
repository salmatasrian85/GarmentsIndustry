package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WorkerMainDasbaordFxmlController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void NominateForAwardButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReqShiftChangeButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RegisterforTrainingProgramButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backtoAllUsersButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ApplyForFinancialAidButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RegForHealthProgramButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReportSafetyIssueButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RequestForLeaveOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void myProfileButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkerMyProfile.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("WorkerMainDasbaord");

        stage.setScene(scene);
        stage.show();

    }
}