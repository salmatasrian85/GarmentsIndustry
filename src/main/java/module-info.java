module mainpkg.garmentsindustry {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpkg.garmentsindustry to javafx.fxml;
    exports mainpkg.garmentsindustry;
}