package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableColumn <Nominate, Integer> WorkerIdTc;
    @javafx.fxml.FXML
    private TextField WorkerIDTF;
    @javafx.fxml.FXML
    private Label ErrorL;

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
    public void filterButtonOA(ActionEvent actionEvent) {
        nominateTV.getItems().clear();
        String awardCategory = awardcategoryComboFilter.getValue();

        for (Nominate nominate :nominateArrayList){
            if (Objects.equals(nominate.getAwardCategory(),awardCategory)){
                nominateTV.getItems().add(nominate);
            }
        }



    }

    @javafx.fxml.FXML
    public void NominatebuttonOA(ActionEvent actionEvent) {
        String workerName = "" , awardCategory = "", reason = "", error = "";
        int workeId = 0;

        boolean flag = true;

        if (nameTextField.getText().isEmpty()){
            flag= false;
            error += "Name text is empty\n";
        }
        else {
            workerName = nameTextField.getText();
        }

        if (WorkerIDTF.getText().isEmpty()) {
            flag = false;
            error += "ID is empty\n";
        } else {
            // number check for int id
            try {
                workeId = Integer.parseInt(WorkerIDTF.getText());
            } catch (NumberFormatException e) {
                error += "ID must be a number\n";
                flag = false;
            }
        }

        if (awardcategoryCombo.getValue() == null){
            flag= false;
            error += "Please choose the award category!\n";
        }
        else {
            awardCategory = awardcategoryCombo.getValue();
        }
        reason = nominationReasonTextarea.getText();

        ErrorL.setText(error); // all errors are set here

        if (flag){
            ErrorL.setText("Nominated Succcessfully");

            Nominate nominate = new Nominate(workerName,workeId,awardCategory,reason);
            nominateArrayList.add(nominate);


            WorkerIDTF.clear();
            awardcategoryCombo.setValue("");
            nominationReasonTextarea.setText("");
            nominateTV.getItems().clear();
            nameTextField.clear();
            nominateTV.getItems().addAll(nominateArrayList);

        }

    }
}
