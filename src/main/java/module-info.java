module com.adam.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.adam.demo to javafx.fxml;
    exports com.adam.demo;
}