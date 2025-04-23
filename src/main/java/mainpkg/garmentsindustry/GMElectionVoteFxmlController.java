package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class GMElectionVoteFxmlController
{
    @javafx.fxml.FXML
    private TableColumn <ElectionVote, String>candidateTC;
    @javafx.fxml.FXML
    private TableColumn <ElectionVote, String>voterIdTC;
    @javafx.fxml.FXML
    private ComboBox <String>candidateCombo;
    @javafx.fxml.FXML
    private TableView <ElectionVote>voteTableView;
    @javafx.fxml.FXML
    private TextField memberIDTF;
    @javafx.fxml.FXML
    private Label ErrorL;

    ArrayList<ElectionVote> voteArrayList = new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {
        candidateCombo.getItems().addAll("Candidate A", "Candidate B", "Candidate C");

        voterIdTC.setCellValueFactory(new PropertyValueFactory<>("memberId"));
        candidateTC.setCellValueFactory(new PropertyValueFactory<>("candidate"));

    }

    @javafx.fxml.FXML
    public void castVoteButtonOA(ActionEvent actionEvent) {
        String memberId = memberIDTF.getText();
        String selectedCandidate = candidateCombo.getValue();
        String error = "";

        boolean flag = true;

        if (memberId.isEmpty()) {
            error += "Member ID cannot be empty.\n";
            flag = false;
        }

        if (selectedCandidate == null) {
            error += "Please select a candidate.\n";
            flag = false;
        }

        ErrorL.setText(error);

        if(flag){
            ErrorL.setText("Vote casted successfully!");
            ElectionVote electionVote = new ElectionVote(memberId, selectedCandidate);
            voteArrayList.add(electionVote);

            voteTableView.getItems().clear();
            voteTableView.getItems().addAll(voteArrayList);

            memberIDTF.clear();
            candidateCombo.setValue(null);
        }

    }
}