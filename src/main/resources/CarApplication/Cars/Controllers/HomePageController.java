package CarApplication.Cars.Controllers;

import java.io.IOException;
import javafx.scene.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HomePageController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private GridPane mainbody;

    @FXML
    void toSignInSignUpBTN(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Fxmloader/views/LogInPageV2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void buy(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/Fxmloader/views/BuyCarView.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void sell(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/Fxmloader/views/SellCarView.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
