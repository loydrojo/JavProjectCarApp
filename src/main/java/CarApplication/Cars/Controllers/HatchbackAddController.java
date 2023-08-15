package CarApplication.Cars.Controllers;

import CarApplication.Cars.Hatchback;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class HatchbackAddController extends SellCarController{

    double carKM = Double.parseDouble(txtCarKM.getText());
    String carMake = txtCarMake.getText();
    String carModel = txtCarModel.getText();
    double carPrice = Double.parseDouble(txtCarPrice.getText());
    String carVin = txtCarVin.getText();
    int carYear = Integer.parseInt(txtCarYear.getText());

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
    void addCar(ActionEvent event) {
        Hatchback userAdd = new Hatchback(carMake, carVin, carModel, carPrice, carYear, carKM, hbCoupe(), hbConv(), hbDoorNum(), hbSports(), hbSisze());
        carsList.add(userAdd);
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