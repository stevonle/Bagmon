module com.example.pocketmon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.Bagmon to javafx.fxml;
    exports com.example.Bagmon;
}