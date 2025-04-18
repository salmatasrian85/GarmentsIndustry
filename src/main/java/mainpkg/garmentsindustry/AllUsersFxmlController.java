package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AllUsersFxmlController
{
    @javafx.fxml.FXML
    private TextField EmailTF;
    @javafx.fxml.FXML
    private TextField PasswordTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void workerbuttonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkerMainDasbaordFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("WorkerMainDasbaord");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void generalMemberbuttonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CreateButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loginButoonOA(ActionEvent actionEvent) {
    }
}