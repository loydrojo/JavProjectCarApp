package CarApplication.User.Controllers;

import CarApplication.User.List.UserList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class RegisterPageController {

    @FXML
    private PasswordField registerConfirmPassword;

    @FXML
    private TextField registerFirstName;

    @FXML
    private TextField registerLastName;

    @FXML
    private Button registerLoginBTN;

    @FXML
    private Button registerPageRegisterBTN;

    @FXML
    private PasswordField registerPassword;

    @FXML
    private TextField registerUsername;


    private UserList userList = UserList.getInstance(); // U

    public void setUserList(UserList userList) {
        this.userList = userList;
    }

    public void registerBTN() {
        String firstName = registerFirstName.getText();
        String lastName = registerLastName.getText();
        String username = registerUsername.getText();
        String password = registerPassword.getText();
        String confirmPassword = registerConfirmPassword.getText();

        if (Objects.equals(password, confirmPassword)) {
            userList.addUser(username, password);
            showAlert("Registration successful!");
            clearFields();
        } else {
            showAlert("Passwords do not match.");
        }
    }

    @FXML
    void functionRegisterLoginBTN() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxmloader/views/LoginPageV2.fxml"));
            GridPane menuPageLayout = loader.load();

            Scene menuPageScene = new Scene(menuPageLayout);
            Stage primaryStage = (Stage) registerLoginBTN.getScene().getWindow();
            primaryStage.setScene(menuPageScene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Registration");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void clearFields() {
        registerFirstName.clear();
        registerLastName.clear();
        registerUsername.clear();
        registerPassword.clear();
        registerConfirmPassword.clear();
    }
}