import java.util.*;

class a {

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class d extends a {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class overriding {
    public static void main(String[] args) {
        a animal = new d();
        animal.sound();
    }
}
