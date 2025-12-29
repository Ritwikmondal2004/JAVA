import java.util.*;

class Animal {
    public void cat() {
        System.out.println("cat miuu");
    }

}

class Dog extends Animal {
    public void dog() {
        System.out.println("dog bark");
    }
}

public class runtime_polimorphism {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.dog();
        d.cat();
    }
}
