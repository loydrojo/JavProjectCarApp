package CarApplication.Cars.Controllers;
import CarApplication.Cars.CarTypes.Sedan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class SedanAddController extends SellCarController{

    @FXML
    private TextField txtCarKM;

    @FXML
    private TextField txtCarMake;

    @FXML
    private TextField txtCarModel;

    @FXML
    private TextField txtCarPrice;

    @FXML
    private TextField txtCarVin;

    @FXML
    private TextField txtCarYear;


    private boolean fieldsAreNotEmpty() {
        return !txtCarKM.getText().isEmpty() &&
                !txtCarMake.getText().isEmpty() &&
                !txtCarModel.getText().isEmpty() &&
                !txtCarPrice.getText().isEmpty() &&
                !txtCarVin.getText().isEmpty() &&
                !txtCarYear.getText().isEmpty();
    }


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
    void addCar(ActionEvent event) {
        // Even when making the variables from SellCarContoller protected, these data members are null.
        Sedan sedanUser = new Sedan(txtCarMake.getText(), txtCarVin.getText(), txtCarModel.getText(), Double.parseDouble(txtCarPrice.getText()), Integer.parseInt(txtCarYear.getText()), Double.parseDouble(txtCarKM.getText()), sedCoupe(), sedConv(), sedDoorNum(), sedSports(), sedTrunk());
        carsList.add(sedanUser);
        txtValidate.setText("Sedan listed for Sale!");
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
