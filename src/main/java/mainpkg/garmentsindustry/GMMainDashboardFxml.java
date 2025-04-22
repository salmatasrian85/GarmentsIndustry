package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GMMainDashboardFxml
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void healthProgramsButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkerMedicalAidFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("MedicalAidFxml");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewReportsButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void suggestProgramButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GMCreateTrainingFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("GMCreateTraining");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void donateToFundButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GMDonateToFundFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("GMDonateToFund");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void volunteerEventButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GMVolunteerRegistrationFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("GMVolunteerRegistration");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void voteElectionButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void membershipRenewalButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GMMembershipRenewalFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("GMMembershipRenewalFxml");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void backToUserSelectionButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void myActivityButtonOA(ActionEvent actionEvent) {
    }
}