import java.util.*;

class calculator{
    public int add(int a,int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
}
public class static_polimorphism {
    
    public static void main(String[] args) {
        calculator c=new calculator();
        System.out.println(c.add(5, 3));          
        System.out.println(c.add(5.5, 3.3));
    }
}
