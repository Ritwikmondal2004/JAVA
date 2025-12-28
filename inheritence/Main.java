import java.util.*;
//parent calss or super class
class School {
    private String name;

    public School() {
        name = "kak";
    }

    public void printschool() {
        System.out.println("school name is--" + name);
    }
}
//subclass or child class
class Student {
    private String name;

    public Student(String name){
        this.name=name;

    }

    public void printstudent() {
        System.out.println("student name is--" + name);
    }
}
public class Main{
    public static void main(String[] args) {
        School school = new School();
        Student student = new Student("ritwik");
        school.printschool();
        student.printstudent();

    }
}