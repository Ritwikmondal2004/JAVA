import java.util.*;


class Animal{
    private String name;
    public Animal(){
        name="Dog";
    }
    public void displayAnimal(){
        System.out.println("Animal name is--"+name);
    }

}
class Animal2 extends Animal{
    private String name;
    public Animal2(String name){
        this.name=name;
    }
    public void displayAnimal2(){
        System.out.println("Animal name is--"+name);
    }
}
public class using_inheritance {
    
    public static void main(String[] args){
        Animal2 animal= new Animal2("cat");
        animal.displayAnimal2();
        animal.displayAnimal();

    }
}
