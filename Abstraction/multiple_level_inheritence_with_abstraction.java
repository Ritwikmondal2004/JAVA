import java.util.*;

abstract class Car {
    abstract public void start();

    public void noise() {
        System.out.println("Beep Beep");

    }
}

abstract class Delar extends Car {
    int numberofCars;
    abstract  void isItopen();
}

class ManualCar extends Delar {
    @Override
    public void start() {
        System.out.println("Manula car start");

    }
    @Override
    public void isItopen(){
        System.out.println("manula car is open");
    }
}

public class multiple_level_inheritence_with_abstraction {
    public static void main(String[] args) {
        Car manualCar = new ManualCar();
        manualCar.start();
        manualCar.noise();
        Delar automaticCar = new ManualCar();
        automaticCar.start();
        automaticCar.noise();

    }
}
