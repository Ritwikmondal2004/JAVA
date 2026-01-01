import java.text.ListFormat.Style;
import java.util.*;
//one to one relation seep
// Passport class
// class Passport{
//     private String passportNumber;
//     public Passport(String passportNumber){
//         this.passportNumber=passportNumber;
//     }
//     public String getPassportNumber(){
//         return passportNumber;
//     }
// }
// class Student{
//     private String name;
//     private Passport passport;
//     public Student(String name, Passport passport){
//         this.name=name;
//         this.passport=passport;
//     }
//     public void displayDetails(){
//         System.out.println("Student Name:"+name);
//         System.out.println("PAssport Number:"+passport.getPassportNumber());
//     }
// }

// // Main class
// public class Main {
//     public static void main(String[] args) {
//         Passport passport = new Passport("A1234567");
//         Student student = new Student("Ritwik Kumar Mondal", passport);
//         student.displayDetails();
//     }
// }

// one to many relation seep
// class Student {
//     private String name;
//     private int id;
//     public Student(String name,int id){
//         this.name=name;
//         this.id=id;

//     }
//     public String getName(){
//         return name;
//     }
//     public int getid(){
//         return id;
//     }
// }
// class College{
//     private String name;
//     private List<Student> students;
//     public College(String name,List<Student> students){
//         this.name=name;
//         this.students=students;
//     }
//     public void  displayDetails(){
//         System.out.println("College Name:"+name);
//         for(int i=0;i<students.size();i++){
//             Student student=students.get(i);
//             System.out.println("Student Name:"+student.getName()+"id--"+student.getid());
//         }
//     }
// }
// public class Main{
//     public static void main(String [] args){
//         List<Student> students=new ArrayList<>();
//         students.add(new Student("Ritwik Kumar Mondal", 101));
//         students.add(new Student("Amit Kumar Mondal", 102));
//         students.add(new Student("Rohit Kumar Mondal", 103));
//         students.add(new Student("Amit Kumar Mondal", 104));
//         College college=new College("UIT College",students);
//         college.displayDetails();
//     }
// }

//composition relation seep
class Student{
    private String name;
    List<Student> courses;
    public Student(String name,List<Student>courses){
        this.name=name;
        this.courses=new ArrayList<>();
    }
    public void addCourse(Student courseName){
        courses.add(courseName);
    }
    public String getName(){
        return name;
    }
}
class Course{
    private String courseName;
    List<Course> students;
    public Course(String courseName){
        this.courseName=courseName;
        this.students=new ArrayList<>();
    }
    public void addStudent(Course studentName){
        students.add(studentName);
    }
    public String getCourseName(){
        return courseName;
    }
}
public class Main{
    public static void main(String [] args){
        Student student1=new Student("Ritwik Kumar Mondal",null);
        Student student2=new Student("Amit Kumar Mondal",null);
        Course course1=new Course("Data Structure");
        Course course2=new Course("Algorithm");
        course1.addStudent(course2);
        student1.addCourse(student2);
        System.out.println("Student Name:"+student1.getName());
        System.out.println("Course Name:"+course1.getCourseName());
        System.out.println("Student Name:"+student2.getName());
        System.out.println("Course Name:"+course2.getCourseName());
    }
}