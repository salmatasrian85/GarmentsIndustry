package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class WorkerNominationController
{
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> awardcategoryCombo;
    @javafx.fxml.FXML
    private TextField employeeIDTF;
    @javafx.fxml.FXML
    private TableColumn nameTC;
    @javafx.fxml.FXML
    private TableView <Nominate>nominateTV;
    @javafx.fxml.FXML
    private TableColumn EmpIdTC;
    @javafx.fxml.FXML
    private TableColumn resonforNominateTC;
    @javafx.fxml.FXML
    private TableColumn awardCataegoryTC;
    @javafx.fxml.FXML
    private ComboBox <String> awardcategoryComboFilter;
    @javafx.fxml.FXML
    private TextArea nominationReasonTextarea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backToWrokerDashButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkerMainDasbaordFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = new Stage();

        stage.setTitle("WorkerMainDasbaord");

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void saveOnClick(ActionEvent actionEvent) {
    }

    @Deprecated
    public void submitbuttonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void NominatebuttonOA(ActionEvent actionEvent) {
    }
}