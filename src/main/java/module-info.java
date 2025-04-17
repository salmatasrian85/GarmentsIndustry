module mainpkg.garmentsindustry {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpkg.garmentsindustry to javafx.fxml;
    opens mainpkg.garmentsindustry.General_Member to javafx.fxml;
    opens mainpkg.garmentsindustry.Worker to javafx.fxml;

    exports mainpkg.garmentsindustry;
}