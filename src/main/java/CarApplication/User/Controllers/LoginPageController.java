package CarApplication.User.Controllers;

import CarApplication.User.List.UserList;
import CarApplication.User.List.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController {

    @FXML
    private Button loginPageBTN;

    @FXML
    private PasswordField loginPassword1;

    @FXML
    private TextField loginPassword2;

    @FXML
    private Button loginRegisterProceedBTN;

    @FXML
    private TextField loginUsername;

    @FXML
    private CheckBox showPassword;
    @FXML
    private String username, password, showPasswordtxt;

    @FXML
    private PasswordField loginPassword;

    private UserList userList; // Reference to the UserList instance



    public void setUserList(UserList userList) {
        this.userList = userList;
    }
    @FXML
    private void functionLoginBTN(ActionEvent event) {
        String enteredUsername = loginUsername.getText();
        String enteredPassword = loginPassword1.getText();

        if (enteredUsername.isEmpty() || enteredPassword.isEmpty()) {
            showAlert("Please enter both username and password");
            return;
        }

        if (userList == null) {
            showAlert("User list is not initialized");
            return;
        }

        User user = userList.findUserByUsername(enteredUsername);

        if (user != null && user.getPassword().equals(enteredPassword)) {
            // Authentication successful, proceed to the next pane
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/Fxmloader/views/HomePageView.fxml"));
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            showAlert("Invalid username or password");
        }
    }

    @FXML
    void functionRegisterBTN(ActionEvent event) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("/Fxmloader/views/RegisterPageV2.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void functionShowPassword(ActionEvent event) {
        boolean show = showPassword.isSelected();
        String currentPassword = loginPassword1.getText();

        loginPassword1.setVisible(!show);
        loginPassword2.setVisible(show);

        if (show) {
            loginPassword2.setText(currentPassword);
        }
    }


    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registration");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


}