import java.util.*;

// Student class
class Student {
    private String name;
    private int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

// College class
class College {
    private String name;
    private List<Student> students = new ArrayList<>();

    College(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() +
                    ", ID: " + student.getId());
        }
    }
}

// Main class
public class ArrayListDemo {
    public static void main(String[] args) {
        College college = new College("ABC College");

        college.addStudent(new Student("Ritwik", 101));
        college.addStudent(new Student("Amit", 102));

        college.printAllStudents();
    }
}
