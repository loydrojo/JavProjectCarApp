package CarApplication.Cars.Controllers;

import CarApplication.Cars.Hatchback;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class HatchbackAddController extends SellCarController{

    CarsData carsData = new CarsData();

    Hatchback hatch = null;

    public void setHatch(Hatchback hatch){
        System.out.println("Setting hatch " + hatch);
        this.hatch=hatch;
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
    private RadioButton hblarge;

    @FXML
    private RadioButton hbmedium;

    @FXML
    private RadioButton hbsmall;

    @FXML
    private Label txtValidate;

    @FXML
    void addCar(ActionEvent event) {

        hatch.setCoupe(hbCoupe());
        hatch.setConvertible(hbConv());
        hatch.setDoorNum(hbDoorNum());
        hatch.setSportsCar(hbSports());
        hatch.setSize(hbSisze());

        carsData.writeCar(hatch);

        txtValidate.setText("Hatchback is listed for sale!");

    }

    public boolean hbCoupe(){
        if(coupeyes.isSelected()){
            return true;
        } else {
            return false;
        }
    }

    public boolean hbConv(){
        if(convyes.isSelected()){
            return true;
        } else {
            return false;
        }
    }

    public int hbDoorNum(){
        return Integer.parseInt(txtDoorNum.getText());
    }

    public boolean hbSports(){
        if(sportyes.isSelected()){
            return true;
        } else {
            return false;
        }
    }

    public String hbSisze(){
        if(hbsmall.isSelected()){
            return "Small";
        } else if(hbmedium.isSelected()){
            return "Medium";
        } else{
            return "Large";
        }
    }
}