package CarApplication.Cars.Controllers;
import CarApplication.Cars.CarTypes.SUV;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SUVAddController extends SellCarController {

    @FXML
    private RadioButton cargolarge;

    @FXML
    private RadioButton cargomedium;

    @FXML
    private RadioButton cargosmall;

    @FXML
    private RadioButton slidingno;

    @FXML
    private RadioButton slidingyes;

    @FXML
    private TextField textEntertainment;

    @FXML
    private Label txtValidate;

    double carKM = Double.parseDouble(txtCarKM.getText());
    String carMake = txtCarMake.getText();
    String carModel = txtCarModel.getText();
    double carPrice = Double.parseDouble(txtCarPrice.getText());
    String carVin = txtCarVin.getText();
    int carYear = Integer.parseInt(txtCarYear.getText());

    @FXML
    private RadioButton bodyonframe;

    @FXML
    private RadioButton unibody;

    @FXML
    private RadioButton hardtopno;

    @FXML
    private RadioButton hardtopyes;

    @FXML
    private RadioButton offno;

    @FXML
    private RadioButton offyes;

    @FXML
    private RadioButton trucklarge;

    @FXML
    private RadioButton truckmedium;

    @FXML
    private RadioButton trucksmall;

    @FXML
    void addCar(ActionEvent event) {
        SUV userAdd = new SUV(carMake, carVin, carModel, carPrice, carYear, carKM, slidingDoors(), entertainment(), cargo());
        carsList.add(userAdd);
    }

    public boolean slidingDoors(){
        if(slidingyes.isSelected()){
            return true;
        } else {
            return false;
        }
    }

    public String entertainment(){
        return textEntertainment.getText();
    }

    public String cargo(){
        if(cargosmall.isSelected()){
            return "Small";
        }else if(cargomedium.isSelected()){
            return "Medium";
        } else {
            return "Large";
        }
    }

}
