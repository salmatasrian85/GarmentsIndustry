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
    public void NominateForAwardButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkerNomnationFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("Worker Nomination");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void ReqShiftChangeButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkerShiftChangeFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("Worker Shift change");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void RegisterforTrainingProgramButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backtoAllUsersButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AllUsersFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("All user");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void ApplyForFinancialAidButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkerFinancialAidFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("Worker Financial Aid");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void RegForHealthProgramButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkerMedicalAidFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("WorkerMedicalAid");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void ReportSafetyIssueButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkerReportSafetyProblem.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("Worker Report Safety Problem");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void RequestForLeaveOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkerRequestForLeaveFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("Worker Leave of absence");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void myProfileButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkerMyProfile.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("Worker My profile");

        stage.setScene(scene);
        stage.show();

    }
}