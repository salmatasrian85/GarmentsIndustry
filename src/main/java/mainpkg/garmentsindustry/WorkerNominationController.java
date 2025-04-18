package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class WorkerNominationController
{
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> awardcategoryCombo;
    @javafx.fxml.FXML
    private TableColumn <Nominate, String>nameTC;
    @javafx.fxml.FXML
    private TableView <Nominate>nominateTV;
    @javafx.fxml.FXML
    private TableColumn <Nominate, String>resonforNominateTC;
    @javafx.fxml.FXML
    private TableColumn <Nominate, String> awardCataegoryTC;
    @javafx.fxml.FXML
    private ComboBox <String> awardcategoryComboFilter;
    @javafx.fxml.FXML
    private TextArea nominationReasonTextarea;
    @javafx.fxml.FXML
    private Label ErrorL;
    @javafx.fxml.FXML
    private TableColumn WorkerIdTc;
    @javafx.fxml.FXML
    private TextField WorkerIDTF;

    ArrayList<Nominate> nominateArrayList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        awardcategoryCombo.getItems().addAll("Best Performer", "Most Dedicated", "Team Player","Fastest Stitcher");
        awardcategoryComboFilter.getItems().addAll("Best Performer", "Most Dedicated", "Team Player","Fastest Stitcher");

        WorkerIdTc.setCellValueFactory(new PropertyValueFactory<>("workeId"));
        nameTC.setCellValueFactory(new PropertyValueFactory<>("workerName"));
        awardCataegoryTC.setCellValueFactory(new PropertyValueFactory<>("awardCategory"));
        resonforNominateTC.setCellValueFactory(new PropertyValueFactory<>("reason"));
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
    public void NominatebuttonOA(ActionEvent actionEvent) {
        String workerName = "";
        int workeId = 0;
        String awardCategory = "";
        String reason = "" ;

        boolean flag = true;

        if (nameTextField.getText().isEmpty()){
            flag= false;
            ErrorL.setText(("Name text is empty"));
        }
        else {
            workerName = nameTextField.getText();
        }
        if (WorkerIDTF.getText().isEmpty()){
            flag= false;
            ErrorL.setText(("ID text is empty"));
        }
        else {
            workeId = Integer.parseInt(WorkerIDTF.getText());

        }
        if (awardcategoryCombo.getValue() == null){
            flag= false;
            ErrorL.setText(("award text is empty"));
        }
        else {
            awardCategory = awardcategoryCombo.getValue();
        }
        reason = nominationReasonTextarea.getText();

        if (flag){
            Nominate nominate = new Nominate(workerName,workeId,awardCategory,reason);
            nominateArrayList.add(nominate);
            ErrorL.setText("Nominated Succesfullly");
            nominateTV.getItems().add(nominate);
            nameTextField.clear();
            WorkerIDTF.clear();
            awardcategoryCombo.setValue("");
            nominationReasonTextarea.setText("");
        }


    }

    @javafx.fxml.FXML
    public void filterButtonOA(ActionEvent actionEvent) {
        nominateTV.getItems().clear();
        String awardCategory = awardcategoryComboFilter.getValue();

        for (Nominate nominate :nominateArrayList){
            if (Objects.equals(nominate.getAwardCategory(),awardCategory)){
                nominateTV.getItems().add(nominate);

            }

        }
    }

}