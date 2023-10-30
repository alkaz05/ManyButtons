module com.example.manybuttons {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.manybuttons to javafx.fxml;
    exports com.example.manybuttons;
}