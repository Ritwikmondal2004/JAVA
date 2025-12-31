import java.util.*;

interface Carinterface{
    public void start();
    public void numberOfGears();

    default void airBugs(){
        System.out.println("airBugs");
    }
    static void printVehicleType(){
        System.out.println("It is abstract");
    }


}
class ManualCar implements Carinterface{
    public void start(){
        System.out.println("Push the start button");

    }
    public void numberOfGears(){
        System.out.println("5 Gears");
    }
    @Override
    public void airBugs(){
        System.out.println("airBugs");
    }
}
public class Main {
    public static void main(String[] args){
        Carinterface manualCar=new ManualCar();
        manualCar.start();
        manualCar.numberOfGears();
        manualCar.airBugs();
        Carinterface.printVehicleType();
    }
}
