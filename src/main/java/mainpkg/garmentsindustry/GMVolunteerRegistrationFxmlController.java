package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.Objects;

public class GMVolunteerRegistrationFxmlController
{
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField MemberIDTF;
    @FXML
    private ComboBox<String> activityAreaCombo;
    @FXML
    private TextArea motivationTextarea;
    @FXML
    private CheckBox volunteerBeforeCheckBox;
    @FXML
    private Label ErrorL;

    @FXML
    private TableView<VolunteerRegistration> volunteerTV;
    @FXML
    private TableColumn<VolunteerRegistration, String> volunteerIdTC;
    @FXML
    private TableColumn<VolunteerRegistration, String> nameTC;
    @FXML
    private TableColumn<VolunteerRegistration, String> activityAreaTC;
    @FXML
    private TableColumn<VolunteerRegistration, String> motivationTC;
    @FXML
    private TableColumn<VolunteerRegistration, String> volunteerBeforeTC;
    @FXML
    private ComboBox<String> activityAreaComboFilter;

    ArrayList<VolunteerRegistration> volunteerList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        activityAreaCombo.getItems().addAll("Health Program", "Event Support", "Logistics", "Awareness Campaign");
        activityAreaComboFilter.getItems().addAll("Health Program", "Event Support", "Logistics", "Awareness Campaign");

        volunteerIdTC.setCellValueFactory(new PropertyValueFactory<>("memberId"));
        nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        activityAreaTC.setCellValueFactory(new PropertyValueFactory<>("activityArea"));
        motivationTC.setCellValueFactory(new PropertyValueFactory<>("motivation"));
        volunteerBeforeTC.setCellValueFactory(new PropertyValueFactory<>("workedBefore"));
    }

    @javafx.fxml.FXML
    public void registerVolunteerButtonOA(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String memberId = MemberIDTF.getText();
        String activityArea = activityAreaCombo.getValue();
        String motivation = motivationTextarea.getText();
        boolean workedBefore = volunteerBeforeCheckBox.isSelected();

        String error = "";
        boolean flag = true;

        if (name.isEmpty()) {
            error += "Name is required.\n";
            flag = false;
        }
        if (memberId.isEmpty()) {
            error += "Member ID is required.\n";
            flag = false;
        }
        if (activityArea == null) {
            error += "Please select an activity area.\n";
            flag = false;
        }
        if (motivation.isEmpty()) {
            error += "Please provide your motivation.\n";
            flag = false;
        }

        ErrorL.setText(error);

        if (flag) {
            ErrorL.setText("Succesfull!!");
            VolunteerRegistration volunteer = new VolunteerRegistration(name,memberId,activityArea,motivation,workedBefore);
            volunteerList.add(volunteer);

            volunteerTV.getItems().addAll(volunteerList);

            nameTextField.clear();
            MemberIDTF.clear();
            activityAreaCombo.setValue(null);
            motivationTextarea.clear();
            ErrorL.setText("");
        }
    }

    @javafx.fxml.FXML
    public void filterButtonOA(ActionEvent actionEvent) {
        String selectedArea = activityAreaComboFilter.getValue();
        volunteerTV.getItems().clear();

        for (VolunteerRegistration volunteer : volunteerList) {
            if (Objects.equals(volunteer.getActivityArea(), selectedArea)) {
                volunteerTV.getItems().add(volunteer);
            }
        }
    }
}