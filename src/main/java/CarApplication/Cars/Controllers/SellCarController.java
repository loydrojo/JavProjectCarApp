package CarApplication.Cars.Controllers;

import java.io.IOException;

import CarApplication.Cars.CarTypes.SUV;
import CarApplication.Cars.CarTypes.Sedan;
import CarApplication.Cars.CarTypes.Truck;
import CarApplication.Cars.Hatchback;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.*;
import javafx.stage.Stage;

public class SellCarController extends CarsData {
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
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
        double carKM = Double.parseDouble(txtCarKM.getText());
        String carMake = txtCarMake.getText();
        String carModel = txtCarModel.getText();
        double carPrice = Double.parseDouble(txtCarPrice.getText());
        String carVin = txtCarVin.getText();
        int carYear = Integer.parseInt(txtCarYear.getText());

        Parent root = null;
        Stage stage = new Stage();

        if (sedan.isSelected()) {
            Sedan sedanCar = new Sedan(carMake, carVin, carModel, carPrice, carYear, carKM, false, false, 4, false, "");

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxmloader/views/SedanAddView.fxml"));
            root = loader.load();
            SedanAddController sac = loader.getController();
            sac.setSedan(sedanCar);
        } else if (hatchback.isSelected()) {
            Hatchback hatchCar = new Hatchback(carMake, carVin, carModel, carPrice, carYear, carKM, false, false, 4, false, "");

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxmloader/views/HatchbackAddView.fxml"));
            root = loader.load();
            HatchbackAddController hac = loader.getController();
            hac.setHatch(hatchCar);
        } else if (truck.isSelected()) {
            Truck truckCar = new Truck(carMake, carVin, carModel, carPrice, carYear, carKM, false, "", "", false);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/QFxmloader/views/TruckAddView.fxml"));
            root = loader.load();
            TruckAddController tac = loader.getController();
            tac.setTruck(truckCar);
        } else if (SUV.isSelected()) {
            SUV suvCar = new SUV(carMake, carVin, carModel, carPrice, carYear, carKM, false, "", "");

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxmloader/views/SUVAddView.fxml"));
            root = loader.load();
            SUVAddController suvac = loader.getController();
            suvac.setSUV(suvCar);
        }

        if (root != null) {
            stage.setScene(new Scene(root));
            stage.show();
        }
    }
}