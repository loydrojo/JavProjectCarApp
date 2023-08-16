package CarApplication.Cars.CarTypes;

public class Sedan extends MidSizeCars {
    private boolean sportsCar;
    private String trunkSize;

    public Sedan(String make, String vinNumber, String model, double price,
                 int year, double mileage, boolean coupe, boolean convertible, int doorNum, boolean sportsCar, String trunkSize) {
        super(make, vinNumber, model, price, year, mileage, coupe, convertible, doorNum);
        this.trunkSize = trunkSize;
        this.sportsCar = sportsCar;
    }

    // Getter for sportsCar
    public boolean isSportsCar() {
        return sportsCar;
    }

    // Setter for sportsCar
    public void setSportsCar(boolean sportsCar) {
        this.sportsCar = sportsCar;
    }

    // Getter for trunkSize
    public String getTrunkSize() {
        return trunkSize;
    }

    // Setter for trunkSize
    public void setTrunkSize(String trunkSize) {
        this.trunkSize = trunkSize;
    }

    public String toString(){
        return super.toString() + ", Sports Car: " + isSportsCar() +
                ", Trunk size: " + getTrunkSize();
    }

}

