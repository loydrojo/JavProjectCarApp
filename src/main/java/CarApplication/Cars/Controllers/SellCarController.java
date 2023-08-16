package CarApplication.Cars.Controllers;

import java.io.IOException;

import CarApplication.Cars.CarTypes.Sedan;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.*;
import javafx.stage.Stage;

public class SellCarController extends CarsData{

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    protected Button btnNextPage;

    @FXML
    protected RadioButton sedan;

    @FXML
    protected RadioButton hatchback;

    @FXML
    protected RadioButton truck;

    @FXML
    protected RadioButton SUV;

    @FXML
    protected TextField txtCarKM;

    @FXML
    protected TextField txtCarMake;

    @FXML
    protected TextField txtCarModel;

    @FXML
    protected TextField txtCarPrice;

    @FXML
    protected TextField txtCarVin;

    @FXML
    protected TextField txtCarYear;

    @FXML
    private ToggleGroup bodyType;

    @FXML
    void btnNextPage(ActionEvent event) throws IOException {
        /*TODO: These are commented out because they generate the NullPointerException
        and idk how to deal with. You'll see they're also commented out of the other controllers
        and idk how to get the other controllers to look at the same data or have them communicate the same variables with each other.
        */
        double carKM = Double.parseDouble(txtCarKM.getText());
        String carMake = txtCarMake.getText();
        String carModel = txtCarModel.getText();
        double carPrice = Double.parseDouble(txtCarPrice.getText());
        String carVin = txtCarVin.getText();
        int carYear = Integer.parseInt(txtCarYear.getText());
        if(sedan.isSelected()){

            // Initializes some of the fields so that it is passed to the next page
            Sedan sedan = new Sedan(carMake, carVin, carModel, carPrice, carYear, carKM, false, false, 4, false, "");

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Fxmloader/views/SedanAddView.fxml"));
            SedanAddController sac = new SedanAddController();
            sac.setSedan(sedan);
            loader.setController(sac);
            root = loader.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if(hatchback.isSelected()){
            root = FXMLLoader.load(getClass().getResource("Fxmloader/views/HatchbackAddView.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if(truck.isSelected()) {
            root = FXMLLoader.load(getClass().getResource("Fxmloader/views/TruckAddView.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if(SUV.isSelected()) {
            root = FXMLLoader.load(getClass().getResource("Fxmloader/views/SUVAddView.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    // Methods to retrieve items
    // public void getCarMalke()

}