package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class DashboardFxml {
    public static class WorkerProfileFxmlController
    {
        @javafx.fxml.FXML
        private TextField phoneNumberTextField;
        @javafx.fxml.FXML
        private TextField addressTextField;
        @javafx.fxml.FXML
        private TextField nameTextField;
        @javafx.fxml.FXML
        private TextField ageTextField;

        @javafx.fxml.FXML
        public void initialize() {
        }

        @javafx.fxml.FXML
        public void saveOnClick(ActionEvent actionEvent) {
        }
    }
}
