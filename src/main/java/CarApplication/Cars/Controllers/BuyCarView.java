package CarApplication.Cars.Controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.*;

public class BuyCarView extends CarsData {

    @FXML
    private Label fileContent;

    public void initialize() {

        CarsData carlist = new CarsData();

        fileContent.setText(carlist.toString(carlist.readAllCars()));

    }

}