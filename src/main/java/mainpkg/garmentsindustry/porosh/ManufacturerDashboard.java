package mainpkg.garmentsindustry.porosh;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class ManufacturerDashboard
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void u2g1(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u2g1.fxml"));
            Parent root = fxmlLoader.load();
            Node source = (Node) actionEvent.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("u2g2");
            stage.show();
        }catch (IOException exception){
            exception.printStackTrace();
    }

    @javafx.fxml.FXML
    public void u2g7(ActionEvent actionEvent) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u2g7.fxml"));
                Parent root = fxmlLoader.load();
                Node source = (Node) actionEvent.getSource();
                Stage stage = (Stage) source.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.setTitle("u2g3");
                stage.show();
            }catch (IOException exception){
                exception.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void u2g6(ActionEvent actionEvent) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u2g6.fxml"));
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
    public void u2g8(ActionEvent actionEvent) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u2g8.fxml"));
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
    public void u2g3(ActionEvent actionEvent) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u2g3.fxml"));
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
    public void u2g2(ActionEvent actionEvent) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u2g2.fxml"));
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
    public void u2g5(ActionEvent actionEvent) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u2g5.fxml"));
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
    public void u2g4(ActionEvent actionEvent) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpkg/garmentsindustry/porosh/u2g4.fxml"));
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