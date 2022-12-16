module com.example.game_library {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.game_library to javafx.fxml;
    exports com.example.game_library;
}