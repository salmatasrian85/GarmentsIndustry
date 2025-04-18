module mainpkg.garmentsindustry {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens mainpkg.garmentsindustry to javafx.fxml;
    exports mainpkg.garmentsindustry;
}