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
class Student {
    private String name;
    private int id;
    public Student(String name,int id){
        this.name=name;
        this.id=id;

    }
    public String getName(){
        return name;
    }
    public int getid(){
        return id;
    }
}
class College{
    private String name;
    private List<Student> students;
    public College(String name,List<Student> students){
        this.name=name;
        this.students=students;
    }
    public void  displayDetails(){
        System.out.println("College Name:"+name);
        for(int i=0;i<students.size();i++){
            Student student=students.get(i);
            System.out.println("Student Name:"+student.getName()+"id--"+student.getid());
        }
    }
}
public class Main{
    public static void main(String [] args){
        List<Student> students=new ArrayList<>();
        students.add(new Student("Ritwik Kumar Mondal", 101));
        students.add(new Student("Amit Kumar Mondal", 102));
        students.add(new Student("Rohit Kumar Mondal", 103));
        students.add(new Student("Amit Kumar Mondal", 104));
        College college=new College("UIT College",students);
        college.displayDetails();
    }
}