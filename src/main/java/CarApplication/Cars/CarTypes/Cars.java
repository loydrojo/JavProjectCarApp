package CarApplication.Cars.CarTypes;

import java.io.Serializable;

public class Cars implements Serializable {
    private String make;
    private String vinNumber;
    private String model;
    private double price;
    private int year;
    private double mileage;
    // private String bodyType;

    public Cars(String make, String vinNumber, String model, double price, int year, double mileage) {
        // this.bodyType = bodyType;
        this.make = make;
        this.vinNumber = vinNumber;
        this.model = model;
        this.price = price;
        this.year = year;
        this.mileage = mileage;
    }

    // Getter for 'make'
    public String getMake() {
        return make;
    }

    // Setter for 'make'
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for 'vinNumber'
    public String getVinNumber() {
        return vinNumber;
    }

    // Setter for 'vinNumber'
    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    // Getter for 'model'
    public String getModel() {
        return model;
    }

    // Setter for 'model'
    public void setType(String model) {
        this.model = model;
    }

    // Getter for 'price'
    public double getPrice() {
        return price;
    }

    // Setter for 'price'
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price must be a non-negative number.");
        }
        this.price = price;
    }

    // Getter for 'year'
    public double getYear() {
        return year;
    }

    // Setter for 'year'
    public void setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be a positive whole number.");
        }
        this.year = year;
    }

    // Getter for 'milage'
    public double getMileage() {
        return mileage;
    }

    // Setter for 'mileage'
    public void setMileage(double mileage) {
        if (mileage < 0) {
            throw new IllegalArgumentException("Mileage must be a non-negative number.");
        }
        this.mileage = mileage;
    }

    public String toString(){
        return "Make: " + getMake() + ", "+
                "Model: " + getModel() + ", "+
                "Price : " + getPrice() + ", "+
                "VIN: " + getVinNumber() + ", "+
                "Year: " + getYear() + ", "+
                "Mileage: " + getMileage();
    }

    /* Create method to parse each car into an object of cars to create an ArrayList  */
    public Cars parseCar(String values){
        Object carObject = (Object)values;
        Cars newCar = (Cars)carObject;
        return newCar;
    }
}