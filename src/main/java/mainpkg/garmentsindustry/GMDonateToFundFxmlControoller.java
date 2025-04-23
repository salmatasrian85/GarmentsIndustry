package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class GMDonateToFundFxmlControoller
{
    @javafx.fxml.FXML
    private TextField memberIdTextField;
    @javafx.fxml.FXML
    private TextField fullNameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> donationFieldCombo;
    @javafx.fxml.FXML
    private TextField donationAmountTextField;
    @javafx.fxml.FXML
    private RadioButton bankRadio;
    @javafx.fxml.FXML
    private RadioButton cardRadio;
    @javafx.fxml.FXML
    private ToggleGroup paymentToggleGroup;
    @javafx.fxml.FXML
    private TableView<DonateToFund> donationTableView;
    @javafx.fxml.FXML
    private TableColumn<DonateToFund, String> idColumn;
    @javafx.fxml.FXML
    private TableColumn<DonateToFund, String> nameColumn;
    @javafx.fxml.FXML
    private TableColumn<DonateToFund, String> fieldColumn;
    @javafx.fxml.FXML
    private TableColumn<DonateToFund, Double> amountColumn;
    @javafx.fxml.FXML
    private TableColumn<DonateToFund, String> paymentColumn;
    @javafx.fxml.FXML
    private Label errorLabel;

    ArrayList<DonateToFund> donationList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        donationFieldCombo.getItems().addAll("Medical Aid", "Training Program", "Emergency Relief", "Scholarship Fund");

        idColumn.setCellValueFactory(new PropertyValueFactory<>("memberId"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        fieldColumn.setCellValueFactory(new PropertyValueFactory<>("donationField"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        paymentColumn.setCellValueFactory(new PropertyValueFactory<>("paymentMethod"));
    }

    @javafx.fxml.FXML
    public void submitDonationButtonOA(ActionEvent actionEvent) {
        String memberId = memberIdTextField.getText();
        String fullName = fullNameTextField.getText();
        String donationField = donationFieldCombo.getValue();
        String paymentMethod = "";
        String error = "";
        boolean flag = true;

        double amount = 0;
        try {
            amount = Double.parseDouble(donationAmountTextField.getText());
            if (amount <= 0) {
                flag = false;
                error += "Enter a positive amount\n";
            }
        } catch (NumberFormatException e) {
            flag = false;
            error += "Enter a valid donation amount\n";
        }

        if (memberId.isEmpty()) {
            flag = false;
            error += "Member ID is required\n";
        }

        if (fullName.isEmpty()) {
            flag = false;
            error += "Full name is required\n";
        }

        if (donationField == null) {
            flag = false;
            error += "Select a donation field\n";
        }

        if (bankRadio.isSelected()) {
            paymentMethod = bankRadio.getText();
        } else if (cardRadio.isSelected()) {
            paymentMethod = cardRadio.getText();
        } else {
            flag = false;
            error += "Select a payment method\n";
        }

        errorLabel.setText(error);

        if (flag) {
            DonateToFund donation = new DonateToFund(memberId, fullName, donationField, amount, paymentMethod);
            donationList.add(donation);
            donationTableView.getItems().clear();
            donationTableView.getItems().addAll(donationList);

            memberIdTextField.clear();
            fullNameTextField.clear();
            donationFieldCombo.setValue(null);
            donationAmountTextField.clear();
            errorLabel.setText("");
        }
    }
}