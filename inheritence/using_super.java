import java.util.*;
class School{
    private String name;
    public School(){
        name="kak";
    }
    public void printschool(){
        System.out.println("school name is--"+name);

    }

}
class Student extends School{
    private String name;
    public Student(String name){
        this.name=name;

    }
    public void printstudent(){
        System.out.println("student name is--"+name);
    }
}
class Parents extends Student{
    private String name;
    public Parents(String name,String Parentsname){
        super(Parentsname);
        this.name=name;
    }
    public void printparents(){
        System.out.println("parents name is--"+name);
    }
}  
class Teacher extends School{
    private String name;
    private String subject;
    public Teacher(String name, String subject){
        this.name=name;
        this.subject=subject;
    }
    public void printname(){
        System.out.println("name is --"+name);
        System.out.println("subject is --"+subject);
    }
}
public class using_super {
    public static void main(String [] args){
        Teacher teacher=new Teacher("ritwik mondal","maths");
        Parents parents=new Parents("ritwik mondal","amit mondal");
        teacher.printname();
        parents.printparents();
        parents.printstudent();
        parents.printschool();
    }
}
