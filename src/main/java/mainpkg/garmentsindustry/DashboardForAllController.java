package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class DashboardForAllController
{
    @FXML
    public void initialize() {
    }

    @FXML
    public void WorkerButtonUserOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WorkerDashboardFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = new Stage();
        nextStage.setScene(scene);
        nextStage.setTitle("Garments Industry");
        nextStage.show();

}

    @FXML
    public void GeneralMemberButtonUserOA(ActionEvent actionEvent) {
    }
}