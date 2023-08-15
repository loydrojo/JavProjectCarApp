
package CarApplication.User;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.IOException;



public class UserApp extends Application {
    private Stage primaryStage;
    private static UserApp instance;

    @Override
    public void start(Stage primaryStage) {
        instance = this;
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("CarList App");

        initLoginLayout();
    }

    private void switchToScreen(String fxmlResource) {
         try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(fxmlResource));


            GridPane newLayout = loader.load();

            Scene newScene = new Scene(newLayout);
            primaryStage.setScene(newScene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initLoginLayout() {
        switchToScreen("/Fxmloader/views/LoginPageV2.fxml");
    }



    public static UserApp getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

