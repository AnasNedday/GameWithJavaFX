module com.example.gamejavafxfinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gamejavafxfinal to javafx.fxml;
    exports com.example.gamejavafxfinal;
}