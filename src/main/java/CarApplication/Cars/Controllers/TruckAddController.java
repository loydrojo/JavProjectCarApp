package CarApplication.Cars.Controllers;
import CarApplication.Cars.CarTypes.Truck;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;

public class TruckAddController extends SellCarController{

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
        Truck userAdd = new Truck(carMake, carVin, carModel, carPrice, carYear, carKM, hardtop(), truckSize(), frame(), offRoad());
        carsList.add(userAdd);
    }

    public boolean hardtop(){
        if(hardtopyes.isSelected()){
            return true;
        } else {
            return false;
        }
    }

    public String truckSize(){
        if(trucksmall.isSelected()){
            return "Small";
        } else if(truckmedium.isSelected()){
            return "Medium";
        } else{
            return "Large";
        }
    }

    public String frame(){
        if(bodyonframe.isSelected()){
            return "Body on Frame";
        } else {
            return "Unibody";
        }
    }

    public boolean offRoad(){
        if(offyes.isSelected()){
            return true;
        } else {
            return false;
        }
    }
}
