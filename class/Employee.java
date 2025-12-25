import java.util.*;

class Employee {
    private int salary;
    public String emp_name;

    public void setName(String s) {
        emp_name = s;
    }

    public void setsalary(int val) {
        salary = val;
    }

    public int getsalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.setName("ritwik");
        obj1.setsalary(2000);

        Employee obj2 = new Employee();
        obj2.setName("anything");
        obj2.setsalary(30000);

        System.out.println("Salary of obj1-  " + obj1.emp_name + "salary==" + obj1.getsalary());
        System.out.println("Salary of obj2-   " + obj2.emp_name + "salary==" + obj2.getsalary());

    }
}