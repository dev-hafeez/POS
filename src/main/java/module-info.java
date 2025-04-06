module com.example.pos {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.java;
    requires java.sql;


    opens com.example.pos to javafx.fxml;
    exports com.example.pos;
}