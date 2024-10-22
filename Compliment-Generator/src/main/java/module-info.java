module com.example.complimentgenerator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.complimentgenerator to javafx.fxml;
    exports com.example.complimentgenerator;
}