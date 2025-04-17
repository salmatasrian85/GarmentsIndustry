package mainpkg.garmentsindustry;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello hi!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static class WorkerDashboardFxmlController
    {
        @javafx.fxml.FXML
        public void initialize() {
        }

        @javafx.fxml.FXML
        public void handleTrainingProgram(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void handleUpdateProfile(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void handleNomination(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void handleShiftChange(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void handleFinancialAid(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void handleSafetyReport(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void handleLeaveRequest(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void handleLogout(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void handleHealthProgram(ActionEvent actionEvent) {
        }
    }
}