import java.util.*;

// Passport class
class Passport {
    private String passportNumber;

    Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}

// Student class
class Student {
    private String name;
    private Passport passport;

    Student(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Passport Number: " + passport.getPassportNumber());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport("A1234567");
        Student student = new Student("Ritwik", passport);
        student.displayDetails();
    }
}
