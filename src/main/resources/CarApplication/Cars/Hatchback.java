package CarApplication.Cars;

public class Hatchback extends MidSizeCars{
    // Sub-compact or compact
    private String size;

    public Hatchback(String make, String vinNumber, String model, double price,
                     int year, double mileage, boolean coupe, boolean convertible, int doorNum, boolean sportsCar, String size){
        super(make, vinNumber, model, price, year, mileage, coupe, convertible, doorNum);
        this.size = size;
    }

    // Getter for "size"
    public String getSize() {
        return size;
    }

    // Setter for "size"
    public void setSize(String size) {
        this.size = size;
    }

    public String toString(){
        return super.toString() + ", Car Size: " + size;
    }
}