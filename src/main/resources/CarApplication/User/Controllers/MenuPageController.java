package CarApplication.User.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuPageController {

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

    private String username, password, showPasswordtxt;

    @FXML
    private void functionLoginBTN(ActionEvent event) {
        // login(); // Method for get text from registration
        try {
            login();
            /*
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxmloader/views/MenuPage.fxml"));
            GridPane registerLayout = loader.load();

            Scene registerScene = new Scene(registerLayout);
            Stage primaryStage = (Stage) loginPageBTN.getScene().getWindow();
            primaryStage.setScene(registerScene);
            primaryStage.show();
            */
            Parent root = FXMLLoader.load(getClass().getResource("/Fxmloader/views/HomePageView.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void functionRegisterBTN(ActionEvent event) {
        try {
            /*
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxmloader/views/RegisterPageV2.fxml"));
            AnchorPane registerLayout = loader.load();

            Scene registerScene = new Scene(registerLayout);
            Stage primaryStage = (Stage) loginPageBTN.getScene().getWindow();
            primaryStage.setScene(registerScene);
            primaryStage.show();

             */

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


    private void login() {
        String username = this.username = loginUsername.getText();
        String password1 = this.password = loginPassword1.getText();
        String password2 = this.showPasswordtxt = loginPassword2.getText();

        if (username.isEmpty() || password1.isEmpty()) {
            showAlert("Fields Should not be empty");
        } else if (!password1.equals(password2)){
            showAlert("Incorrect password");
        } else {
            showAlert("Authentication Success");
        }
    }
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registration");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    public boolean isAuthenticated() {
        // Return true for now, If needed for Carl list optional tho
        return true;
    }

}