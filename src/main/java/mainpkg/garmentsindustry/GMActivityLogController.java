package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class GMActivityLogController
{
    @javafx.fxml.FXML
    private TableView <ActivityLog> activityLogTable;
    @javafx.fxml.FXML
    private TableColumn <ActivityLog,LocalDate>dateColumn;
    @javafx.fxml.FXML
    private TableColumn <ActivityLog,String>typeColumn;
    @javafx.fxml.FXML
    private TableColumn <ActivityLog,String>descriptionColumn;

    @javafx.fxml.FXML
    public void initialize() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));

    }

    @Deprecated
    public void handleCategoryButtonClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void programsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void eventsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void votingButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void donationButton(ActionEvent actionEvent) {
    }
}