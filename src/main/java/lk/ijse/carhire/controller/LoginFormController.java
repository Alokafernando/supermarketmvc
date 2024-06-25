package lk.ijse.carhire.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.carhire.db.DbConnection;

import java.io.IOException;
import java.util.Objects;

public class LoginFormController {
    public TextField txtUserName;
    public PasswordField txtPassword;
    public AnchorPane rootNode;

    public void btnLoginOnAction(ActionEvent actionEvent)throws IOException {
        String userName = txtUserName.getText();
        String pw = txtPassword.getText();

        if(userName.equals(DbConnection.USER_NAME) && pw.equals(DbConnection.PASSWORD)) {
            navigate();
        } else {
            new Alert(Alert.AlertType.ERROR, "oops! credential are invalid!").show();
        }
    }

    private void navigate() throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/main_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage primaryStage = (Stage) this.rootNode.getScene().getWindow();

        primaryStage.setTitle("Main");
        primaryStage.centerOnScreen();
        primaryStage.setScene(scene);
    }
}

