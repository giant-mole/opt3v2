package nl.hhs.rentathing;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloController {
    public static ArrayList<String> usersarray=new ArrayList<>();

    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;

    @FXML
    public void loginButton(ActionEvent actionEvent) throws IOException {
        User u = User.verifyUser(emailField.getText(),passwordField.getText());
        if(u != null && !usersarray.contains(u.id)){
            usersarray.add(u.id);
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("user-view.fxml"));
            Parent root = fxmlLoader.load();
            UserController userController = fxmlLoader.getController();
            userController.setUser(u);
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Home");

        }
    }

    @FXML
    public void forgotButton(ActionEvent actionEvent) {

    }
}