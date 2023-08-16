package CarApplication.Cars.Controllers;

import CarApplication.Cars.CarTypes.Cars;

import java.io.*;
import java.util.*;


public class CarsData {

    String carfile = "carlist.dat";
    public ArrayList<Cars> carsList;


    public ArrayList<Cars> readAllCars(){
        carsList = new ArrayList<Cars>();
        ObjectInputStream ois = null;

        System.out.println("READING ALL CARS");
        try{
            File file = new File(carfile);
            System.out.println("carlist.dat exists: "+file.exists());
            System.out.println("carlist.dat path = "+file.getAbsolutePath());
            ois = new ObjectInputStream(new FileInputStream(file));
            System.out.println("READING ALL CARS BEFORE LOOP");
            while(true){
                Cars car = readCar(ois);
                System.out.println("Read "+car);
                carsList.add(car);
            }

        }catch(EOFException eof){
            System.out.println("READING ALL CARS REACHED END OF FILE");
        }catch(Exception e){
            System.out.println("Error reading cars: "+e);
        }finally{
            if(ois != null) {
                try{
                    ois.close();
                }catch(Exception e2){
                    System.out.println("Error closing cars list");
                }
            }
        }
        return carsList;


    }

    public void writeAllCars(ArrayList<Cars> carList){
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream(carfile));
            for(Cars car: carList){
                System.out.println("Writing "+car);
                oos.writeObject(car);
            }

        }catch(Exception e){
            System.out.println("Error writing cars: "+e);
        }finally{
            if(oos != null) {
                try{
                    oos.close();
                }catch(Exception e2){
                    System.out.println("Error closing cars list");
                }
            }
        }

    }

    public void writeCar(Cars car) {
        carsList = readAllCars();
        carsList.add(car);
        writeAllCars(carsList);
    }

    public Cars readCar(ObjectInputStream ois)  throws IOException, ClassNotFoundException{
        return  ((Cars) ois.readObject());
    }

    public String toString(ArrayList<Cars> cars){
        List<String> stringcar = cars.stream().map(object -> Objects.toString(object, null)).toList();
        return stringcar.toString();
    }
}