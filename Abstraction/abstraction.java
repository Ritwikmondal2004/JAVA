import java.util.*;

abstract class Car {
    abstract public void start();

    public void noise() {
        System.out.println("Beep Beep");
    }
}

class ManualCar extends Car {
    public void start() {
        System.out.println("Push the start button");
    }
}
class AutomaticCar extends Car{
    public void start(){
        System.out.println("Push the start button");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Car c = new ManualCar();
        System.out.println("start car--- ");
        c.start();
        System.out.println("car noise--- ");
        c.noise();
        Car car=new AutomaticCar();
        System.out.println("start car--- ");
        car.start();
        car.noise();

    }
}
