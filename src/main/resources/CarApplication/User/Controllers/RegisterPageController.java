package CarApplication.User.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

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



    public void register() {
        String firstName = registerFirstName.getText();
        String lastName = registerLastName.getText();
        String username = registerUsername.getText();
        String password = registerPassword.getText();
        String confirmPassword = registerConfirmPassword.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            showAlert("All fields are required.");
        } else if (password.length() < 8) {
            showAlert("Password must be at least 8 characters long.");
        } else if (!password.equals(confirmPassword)) {
            showAlert("Passwords do not match.");
        } else {
            showAlert("Registration successful!");
            clearFields();
        }
    }

    @FXML
    void functionRegisterLoginBTN() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxmloader/views/MenuPage.fxml"));
            AnchorPane menuPageLayout = loader.load();

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