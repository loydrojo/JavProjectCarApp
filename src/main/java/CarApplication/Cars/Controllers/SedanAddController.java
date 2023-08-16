package CarApplication.Cars.Controllers;

import CarApplication.Cars.CarTypes.Sedan;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SedanAddController extends SellCarController{

    CarsData carsData = new CarsData();

    Sedan sedan = null;


    public void setSedan(Sedan sedan){
        System.out.println("Setting sedan "+sedan);
        this.sedan=sedan;
    }

    SellCarController sellcar = new SellCarController();

    @FXML
    private RadioButton coupeyes;

    @FXML
    private RadioButton coupeno;

    @FXML
    private RadioButton convyes;

    @FXML
    private RadioButton convno;

    @FXML
    private TextField txtDoorNum;

    @FXML
    private RadioButton sportno;

    @FXML
    private RadioButton sportyes;

    @FXML
    private RadioButton trunklarge;

    @FXML
    private RadioButton trunkmedium;

    @FXML
    private RadioButton trunksmall;

    @FXML
    private Label txtValidate;

    @FXML
    private ToggleGroup convTg;

    @FXML
    private ToggleGroup coupeTg;

    @FXML
    private ToggleGroup sportTg;

    @FXML
    private ToggleGroup trunkS;

    @FXML
    void addCar(ActionEvent event) {

        sedan.setCoupe(sedCoupe());
        sedan.setConvertible(sedConv());
        sedan.setDoorNum(sedDoorNum());
        sedan.setTrunkSize(sedTrunk());
        sedan.setSportsCar(sedSports());

        carsData.writeCar(sedan);

        txtValidate.setText("Sedan listed for sale!");
    }

    @FXML
    public boolean sedCoupe(){
        if(coupeyes.isSelected()){
            return true;
        } else {
            return false;
        }
    }

    @FXML
    public boolean sedConv(){
        if(convyes.isSelected()){
            return true;
        } else {
            return false;
        }
    }

    @FXML
    public int sedDoorNum(){
        return Integer.parseInt(txtDoorNum.getText());
    }

    @FXML
    public boolean sedSports(){
        if(sportyes.isSelected()){
            return true;
        } else {
            return false;
        }
    }

    @FXML
    public String sedTrunk(){
        if(trunksmall.isSelected()){
            return "Small";
        } else if(trunkmedium.isSelected()){
            return "Medium";
        } else{
            return "Large";
        }
    }
}