package CarApplication.Cars.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import CarApplication.Cars.CarTypes.SUV;

public class SUVAddController extends SellCarController{

    CarsData carsData = new CarsData();

    SUV suv = null;


    public void setSUV(SUV suv){
        System.out.println("Setting SUV " + suv);
        this.suv=suv;
    }

    SellCarController sellcar = new SellCarController();

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


    @FXML
    void addCar(ActionEvent event) {
        suv.setSlidingDoors(slidingDoors());
        suv.setEntertainmentSystem(entertainment());
        suv.setCargoSpaceSize(cargo());

        carsData.writeCar(suv);

        txtValidate.setText("SUV listed for sale!");
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