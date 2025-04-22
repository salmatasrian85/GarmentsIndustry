package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class WorkerMedicalAidFxmlController
{
    @javafx.fxml.FXML
    private ComboBox <String>timeCombo;
    @javafx.fxml.FXML
    private TableColumn <MedicalAid,String>genderTC;
    @javafx.fxml.FXML
    private TableColumn <MedicalAid,String>nameTC;
    @javafx.fxml.FXML
    private ToggleGroup genderGroup;
    @javafx.fxml.FXML
    private RadioButton otherRadio;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TableView <MedicalAid> medicalAidTable;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private ComboBox <String>dateFilterCombo;
    @javafx.fxml.FXML
    private RadioButton maleRadio;
    @javafx.fxml.FXML
    private TableColumn <MedicalAid,String>descriptionTC;
    @javafx.fxml.FXML
    private RadioButton femaleRadio;
    @javafx.fxml.FXML
    private ComboBox <String> healthServiceCombo;
    @javafx.fxml.FXML
    private DatePicker preferredDatePicker;
    @javafx.fxml.FXML
    private TableColumn  <MedicalAid,String>healthServiceTC;
    @javafx.fxml.FXML
    private Label ErrorL;
    @javafx.fxml.FXML
    private Label dateTC;
    @javafx.fxml.FXML
    private TableColumn <MedicalAid,LocalDate>prefferedDateTC;
    @javafx.fxml.FXML
    private TableColumn <MedicalAid,String>symptomTC;


    ArrayList<MedicalAid> medicalAidArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    private TableColumn <MedicalAid,String> curentlyWorkingTC;
    @javafx.fxml.FXML
    private CheckBox cuurenWorkCB;
    @javafx.fxml.FXML
    private ComboBox <String>symtompComo;

    @javafx.fxml.FXML
    public void initialize() {
        healthServiceCombo.getItems().addAll("General Check-up", "Dental Care", "Eye Examination", "Gynecological Services", "Mental Health Counseling", "First Aid & Emergency Care");
        timeCombo.getItems().addAll("08:00 AM - 09:00 AM", "09:00 AM - 10:00 AM", "10:00 AM - 11:00 AM", "11:00 AM - 12:00 PM", "12:00 PM - 01:00 PM");
        symtompComo.getItems().addAll("fever","cough","fatigue","other");

        nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        healthServiceTC.setCellValueFactory(new PropertyValueFactory<>("healthService"));
        genderTC.setCellValueFactory(new PropertyValueFactory<>("gender"));
        symptomTC.setCellValueFactory(new PropertyValueFactory<>("symptom"));
        descriptionTC.setCellValueFactory(new PropertyValueFactory<>("description"));
        prefferedDateTC.setCellValueFactory(new PropertyValueFactory<>("preferredDate"));
        curentlyWorkingTC.setCellValueFactory(new PropertyValueFactory<>("symptom"));
    }

    @javafx.fxml.FXML
    public void confirmRegistrationOA(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String healthService= healthServiceCombo.getValue();
        String time= timeCombo.getValue();
        LocalDate preferredDate = preferredDatePicker.getValue();
        String symptom=symtompComo.getValue();

        String description = descriptionTA.getText();
        String error= "";
        boolean flag = true;
        String gender= "";

        if (nameTextField.getText().isEmpty()){
            flag = false;
            error +=" name is requied\n";
        }

        if (healthServiceCombo.getValue()==null){
            flag = false;
            error +=" choose health service\n";
        }

        if (preferredDate==null)
        {
            flag = false;
            error += "chooose preferred date\n";

        } else if (preferredDate.isBefore(LocalDate.now())) {
            error += "date is past\n";

        }
        if (timeCombo.getValue()==null)
        {
            flag = false;
            error += "chooose preferred time\n";
        }

        if(maleRadio.isSelected()){
            gender = maleRadio.getText();
        } else if (femaleRadio.isSelected()) {
            gender = femaleRadio.getText();
        }else if (otherRadio.isSelected()) {
            gender = otherRadio.getText();
        } else{
            flag = false;
            error+= "choose gender\n";
        }
        if (symtompComo.getValue()==null){
            flag=false;
            error+= "choose symptomp\n";
        }
        if (!cuurenWorkCB.isSelected()){
            flag=false;
            error+= "choose aid eligigibity\n";
        }
        ErrorL.setText(error);

        if (flag){
            MedicalAid medicalAid = new MedicalAid(name,healthService,time,gender,symptom,description,preferredDate);
            medicalAidArrayList.add(medicalAid);
            medicalAidTable.getItems().add(medicalAid);

        }

    }

    @javafx.fxml.FXML
    public void filterButtonOA(ActionEvent actionEvent) {
    }
}