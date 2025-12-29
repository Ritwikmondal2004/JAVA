import java.util.*;

class ShapeCalculator {
    private int radius;
    private int length;
    private int width;

    public void area(int radius) {
        this.radius = radius;
        double pi = 3.14;
        System.out.println("Area of Circle : " + (int) (pi * (radius * radius)));
    }

    public void area(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Area of Rectangle : " + (int) (length * width));
    }

    public void area(int base1, int base2, int height) {
        System.out.println("Area of Trapezoid : " + (int) (0.5 * (base1 + base2) * height));
    }
}

public class practice_polimorphism {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int radius = scanner.nextInt();
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int base1 = scanner.nextInt();
        int base2 = scanner.nextInt();
        int height = scanner.nextInt();

        ShapeCalculator sc = new ShapeCalculator();
        sc.area(radius);
        sc.area(length, width);
        sc.area(base1, base2, height);

        scanner.close();
    }
}
