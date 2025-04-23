package mainpkg.garmentsindustry;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class GMViewfinanceReportFxmlController
{
    @javafx.fxml.FXML
    private TableColumn <ViewFinanceReport, LocalDate>reportDateColumn;
    @javafx.fxml.FXML
    private TableColumn<ViewFinanceReport,String> reportDescriptionColumn;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TableView<ViewFinanceReport> reportDetailsTable;
    @javafx.fxml.FXML
    private TableColumn<ViewFinanceReport,String> reportTypeColumn;

    @javafx.fxml.FXML
    public void initialize() {
        reportDateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        reportDescriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        reportTypeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
    }

    @javafx.fxml.FXML
    public void goBackToReportList(ActionEvent actionEvent) {
    }
}