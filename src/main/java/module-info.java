module ProjektMP3 {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;

    exports org.example;
    opens org.example.Controllers to javafx.fxml;
}