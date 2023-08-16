package CarApplication.Cars;

import CarApplication.Cars.CarTypes.MidSizeCars;

public class Hatchback extends MidSizeCars {
    // Sub-compact or compact
    private String size;
    private boolean sportsCar;

    public Hatchback(String make, String vinNumber, String model, double price,
                     int year, double mileage, boolean coupe, boolean convertible, int doorNum, boolean sportsCar, String size){
        super(make, vinNumber, model, price, year, mileage, coupe, convertible, doorNum);
        this.size = size;
        this.sportsCar = sportsCar;
    }

    // Getter for "size"
    public String getSize() {
        return size;
    }

    // Setter for "size"
    public void setSize(String size) {
        this.size = size;
    }

    public void setSportsCar(boolean sportsCar) {
        this.sportsCar = sportsCar;
    }

    public boolean isSportsCar() {
        return sportsCar;
    }

    public String toString(){
        return super.toString() + ", Car Size: " + size;
    }


}