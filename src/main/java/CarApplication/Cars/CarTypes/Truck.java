package CarApplication.Cars.CarTypes;

public class Truck extends Cars{
    private boolean hardTopCanopy;
    private String size;
    // Mid-size or full-size
    private String frame;
    // body-on-frame or unibody
    private boolean offRoad;

    public Truck(String make, String vinNumber, String model, double price, int year, double mileage, boolean hardTopCanopy, String size, String frame, boolean offRoad){
        super(make, vinNumber, model, price, year, mileage);
        this.hardTopCanopy = hardTopCanopy;
        this.size = size;
        this.frame = frame;
        this.offRoad = offRoad;
    }

    public void setHardTopCanopy(boolean hardTopCanopy){
        this.hardTopCanopy = hardTopCanopy;
    }

    public boolean getHardTopCanopy(){
        return hardTopCanopy;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    public void setFrame(String frame){
        this.frame = frame;
    }

    public String getFrame(){
        return frame;
    }

    public void setOffRoad(boolean offRoad){
        this.offRoad = offRoad;
    }

    public boolean getOffRoad(){
        return offRoad;
    }

    public String toString(){
        return super.toString() + "Hard top: " + getHardTopCanopy() +
                ", Truck size: " + getSize() +
                ", Frame type: " + getFrame() +
                ", Off road: " + getOffRoad() + "\n";
    }
}
