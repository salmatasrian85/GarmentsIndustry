package mainpkg.garmentsindustry.porosh;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
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
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u1g2.fxml"));
            Parent root = fxmlLoader.load();
            Node source = (Node) actionEvent.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("u1g2");
            stage.show();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void u1g1(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u1g2.fxml"));
            Parent root = fxmlLoader.load();
            Node source = (Node) actionEvent.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("u1g2");
            stage.show();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void u1g8(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u1g8.fxml"));
            Parent root = fxmlLoader.load();
            Node source = (Node) actionEvent.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("u1g2");
            stage.show();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void u1g7(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u1g7.fxml"));
            Parent root = fxmlLoader.load();
            Node source = (Node) actionEvent.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("u1g2");
            stage.show();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void u1g4(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u1g4.fxml"));
            Parent root = fxmlLoader.load();
            Node source = (Node) actionEvent.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("u1g2");
            stage.show();
        }catch (IOException exception){
            exception.printStackTrace();
    }
    }

    @javafx.fxml.FXML
    public void u1g3(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u1g3.fxml"));
            Parent root = fxmlLoader.load();
            Node source = (Node) actionEvent.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("u1g2");
            stage.show();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void u1g6(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u1g6.fxml"));
            Parent root = fxmlLoader.load();
            Node source = (Node) actionEvent.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("u1g2");
            stage.show();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void u1g5(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u1g5.fxml"));
            Parent root = fxmlLoader.load();
            Node source = (Node) actionEvent.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("u1g2");
            stage.show();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}