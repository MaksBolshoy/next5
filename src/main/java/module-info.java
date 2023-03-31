module com.example.next5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.next5 to javafx.fxml;
    exports com.example.next5;
}