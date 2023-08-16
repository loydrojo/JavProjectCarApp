package CarApplication.Cars.Controllers;

import CarApplication.Cars.CarTypes.Truck;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class TruckAddController extends SellCarController{

    CarsData carsData = new CarsData();

    Truck truck = null;


    public void setTruck(Truck truck){
        System.out.println("Setting truck " + truck);
        this.truck=truck;
    }

    SellCarController sellcar = new SellCarController();

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
    private Label txtValidate;

    @FXML
    void addCar(ActionEvent event) {

        truck.setHardTopCanopy(hardtop());
        truck.setSize(truckSize());
        truck.setFrame(frame());
        truck.setOffRoad(offRoad());

        carsData.writeCar(truck);

        txtValidate.setText("Truck listed for sale!");

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