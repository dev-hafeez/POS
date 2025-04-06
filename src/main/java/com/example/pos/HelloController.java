package com.example.pos;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;

public class HelloController {

    @FXML
    private AnchorPane main_form;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginbtn;

    @FXML
    private Button close;
    private Connection connect;
    private PreparedStatement prepear;
    private ResultSet result;
    public void loginAdmin() {
        // SQL query to check username, password, and role
        connect = database.connectDb();
        if (connect == null) {
            // Display an alert if the connection is null
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Database Connection Error");
            alert.setHeaderText(null);
            alert.setContentText("Please check your XAMPP server status.");
            alert.showAndWait();
            return;
        }

        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";

        try {
            // Check if any field is empty before querying the DB
            if (username.getText().isEmpty() || password.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields.");
                alert.showAndWait();
                return;
            }

            prepear = connect.prepareStatement(sql);
            prepear.setString(1, username.getText());
            prepear.setString(2, password.getText());
            result = prepear.executeQuery();

            Alert alert;

            if (result.next()) {
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Successfully Logged in!");
                alert.showAndWait();

                // Hide current window and show dashboard
                /*loginbtn.getScene().getWindow().hide();
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("dashboard.fxml")));
                Stage stage = new Stage();
                stage.getIcons().add(new Image(getClass().getResource("/com/example/pos/logo.png").toExternalForm()));
                Scene scene = new Scene(root);
                stage.initStyle(StageStyle.TRANSPARENT);
                stage.setScene(scene);
                stage.show();*/

            } else {
                alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Invalid Username or Password.");
                alert.showAndWait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeDatabaseResources();
        }
    }


        public void closeDatabaseResources() {
        try {
            if (result != null) {
                result.close();
            }
            if (prepear != null) {
                prepear.close();
            }
            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close(){
        System.exit(0);
    }
}
