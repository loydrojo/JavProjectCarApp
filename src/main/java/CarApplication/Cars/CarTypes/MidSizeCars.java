package CarApplication.Cars.CarTypes;

public class MidSizeCars extends Cars {
    private boolean coupe;
    private boolean convertible;
    private int doorNum;


    public MidSizeCars(String make, String vinNumber, String model, double price,
                       int year, double mileage, boolean coupe, boolean convertible, int doorNum){
        super(make, vinNumber, model, price, year, mileage);
        this.coupe = coupe;
        this.convertible = convertible;
        this.doorNum = doorNum;
    }

    public void setCoupe(boolean coupe){
        this.coupe = coupe;
    }

    public boolean getCoupe(){
        return coupe;
    }

    public void setConvertible(boolean convertible){
        this.convertible = convertible;
    }

    public boolean getConvertible(){
        return convertible;
    }

    public void setDoorNum(int doorNum){
        this.doorNum = doorNum;
    }

    public int doorNum(){
        return doorNum;
    }

    public String toString(){
        return super.toString() + ", Coupe: " + getCoupe() + ", Convertible: " + getConvertible() + ", Doors: " + doorNum();
    }
}