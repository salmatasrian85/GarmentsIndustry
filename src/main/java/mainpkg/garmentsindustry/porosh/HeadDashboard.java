package mainpkg.garmentsindustry.porosh;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import mainpkg.garmentsindustry.HelloApplication;

import java.io.IOException;

public class HeadDashboard
{

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void u1g2(ActionEvent actionEvent) {
        try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AllUsersFxml.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                stage.setTitle("Garments Industry");
                stage.setScene(scene);
                stage.show();
        }
    }

    @javafx.fxml.FXML
    public void u1g1(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void u1g8(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void u1g7(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void u1g4(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void u1g3(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void u1g6(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void u1g5(ActionEvent actionEvent) {
    }
}