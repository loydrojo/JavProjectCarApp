package CarApplication.Cars;

import java.util.*;

import CarApplication.Cars.CarTypes.*;
import CarApplication.Cars.Controllers.CarsData;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.fxml.FXMLLoader;

public class Main extends Application{
    public static void main(String[]args){
        launch(args);
        SUV suv1 = new SUV("Honda", "HBO123", "Odyssey", 8000.50, 2012, 120560.90, true, "Large", "Stereos");
        Truck truck1 = new Truck("Toyota", "TRO456", "4Runner", 45000.99, 2020, 88000.32, false, "Mid-size", "Uni-body", true);
        Sedan sed1 = new Sedan("Hyundai", "HUN890", "Sonata", 23000.75, 2023, 26000, false, false, 4, false, "Medium");
        Hatchback hatch1 = new Hatchback("Ford", "FOR567", "Focus", 48000.89, 2018, 95000.59, false, false, 4, false, "Mid-size");
        MidSizeCars mid1 = new MidSizeCars("Mazda", "MAZ123", "Mazda 3", 23000.50, 2023, 50000, false, false, 4);

        CarsData carData = new CarsData();

        ArrayList<Cars> carList = carData.readAllCars();

        System.out.println("Read "+carList.size()+" cars");

        /* carList.add(suv1);
        carList.add(truck1);
        carList.add(sed1);
        carList.add(hatch1);
        carList.add(mid1); */

        carData.writeAllCars(carList);
    }

    public void start(Stage primaryStage){
        try{
            GridPane root = FXMLLoader.load(getClass().getResource("/Fxmloader/views/HomePageView.fxml"));

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (Exception e){
            System.out.println("Error loading fxml " + e);
            e.printStackTrace();
        }
    }
}