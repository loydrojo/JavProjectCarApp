package CarApplication.Cars.CarTypes;

public class SUV extends Cars{
    private boolean slidingDoors;
    private String cargoSpaceSize;
    private String entertainmentSystem;

    public SUV(String make, String vinNumber, String model, double price, int year, double mileage, boolean slidingDoors, String cargoSpaceSize, String entertainmentSystem){
        super(make, vinNumber, model, price, year, mileage);
        this.slidingDoors = slidingDoors;
        this.cargoSpaceSize = cargoSpaceSize;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void setSlidingDoors(boolean slidingDoors){
        this.slidingDoors = slidingDoors;
    }

    public boolean getSlidingDoors(){
        return slidingDoors;
    }

    public void setCargoSpaceSize(String cargoSpaceSize){
        this.cargoSpaceSize = cargoSpaceSize;
    }

    public String getCargoSpaceSize(){
        return cargoSpaceSize;
    }

    public void setEntertainmentSystem(String entertainmentSystem){
        this.entertainmentSystem = entertainmentSystem;
    }

    public String getEntertainmentSystem(){
        return entertainmentSystem;
    }

    public String toString(){
        return super.toString() + ", Sliding doors:  " + getSlidingDoors() +
                ", Cargo space: " + getCargoSpaceSize() +
                ", Entertainment system: " + getEntertainmentSystem() + "\n";
    }
}


