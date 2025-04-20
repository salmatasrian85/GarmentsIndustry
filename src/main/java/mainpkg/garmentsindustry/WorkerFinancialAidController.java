package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class WorkerFinancialAidController
{
    @FXML
    private TableColumn<FinancialAid , Integer> WorkerIdTc;
    @FXML
    private TextField WorkerIDTF;
    @FXML
    private TableColumn <FinancialAid , String> reasonTC;
    @FXML
    private Label ErrorL;
    @FXML
    private TableColumn <FinancialAid , String>aidTypeTC;
    @FXML
    private TextField idProofTF;
    @FXML
    private CheckBox acceptCB;
    @FXML
    private TextArea ReasonTextarea;
    @FXML
    private TableView <FinancialAid> fiancialAidTV;
    @FXML
    private TextField SalarySlipTF;
    @FXML
    private ComboBox <String> aidTypeCombo;
    @FXML
    private TextField AmountTF;
    @FXML
    private TableColumn <FinancialAid , Integer>amountTC;
    @FXML
    private TableColumn <FinancialAid ,Boolean> acceptTC;

    ArrayList<FinancialAid> financialAidArrayList = new ArrayList<>();

    @FXML
    public void initialize() {
        aidTypeCombo.getItems().addAll("Disaster Relief","Skills Training", "Maternity Support","Housing Assistance","Family Crisis","Child Education","Other (Specify in Reason)");

        WorkerIdTc.setCellValueFactory(new PropertyValueFactory<>("workerId"));
        amountTC.setCellValueFactory(new PropertyValueFactory<>("amount"));
        aidTypeTC.setCellValueFactory(new PropertyValueFactory<>("aidType"));
        reasonTC.setCellValueFactory(new PropertyValueFactory<>("reason"));
        acceptTC.setCellValueFactory(new PropertyValueFactory<>("accept"));
    }

    @FXML
    public void ProofUploadButtonOA(ActionEvent actionEvent) {
    }

    @FXML
    public void SalaryUpButtonOA(ActionEvent actionEvent) {
    }
    @FXML
    public void SubmitbuttonOA(ActionEvent actionEvent) {

        int workerId = 0,amount = 0;
        String aidType = "",reason = "" ,error = "";

        boolean accept = false;

        boolean flag = true;
        if(acceptCB.isSelected()){
            accept = true;
        } else {
           error += "Choose the agreement!\n";
        }

        if (WorkerIDTF.getText().isEmpty()){
            flag= false;
            error += "ID is empty\n";
        }else {
            // number check for int id
            try {
                workerId = Integer.parseInt(WorkerIDTF.getText());
            } catch (NumberFormatException e) {
                error += "ID must be number\n";
                flag = false;
            }
        }

        if (AmountTF.getText().isEmpty()){
            flag= false;
            error += "Please enter Amount in Number\n";
        }else {
            // number check for int id
            try {
                amount = Integer.parseInt(AmountTF.getText());
            } catch (NumberFormatException e) {
                error += "amount must be number\n";
                flag = false;
            }
        }

        if (aidTypeCombo.getValue() == null){
            flag= false;
            error += "Please choose aid Type\n";
        }else {
            aidType = aidTypeCombo.getValue();
        }
        reason = ReasonTextarea.getText();

        ErrorL.setText(error);

        if (flag){
            ErrorL.setText("Submitted Successfully");

            FinancialAid financialAid = new FinancialAid(workerId,amount,aidType,reason,accept);
            financialAidArrayList.add(financialAid);
            WorkerIDTF.clear();
            aidTypeCombo.setValue("");
            ReasonTextarea.setText("");
            fiancialAidTV.getItems().clear();
            AmountTF.clear();
            fiancialAidTV.getItems().add(financialAid);

        }



    }

    @FXML
    public void previousApplicationsButtonOA(ActionEvent actionEvent) {
        fiancialAidTV.getItems().clear();
        fiancialAidTV.getItems().addAll(financialAidArrayList);
    }
}