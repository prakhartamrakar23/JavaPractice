package JavaPractice;
import java.util.Scanner;

class Employee {
    private int empid;
    private float salary;

    public void setEmployee(int empid, float salary) {
        this.empid = empid;
        this.salary = salary;
    }

    int getEmpid() {
        return empid;
    }

    float getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Employee Id: " + empid);
        System.out.println("Salary: " + salary);
    }
}

class EmployeeLevel extends Employee {

    public void display() {
        super.display();
        if (getSalary() > 100) {
            System.out.println("level 1");
        } else if (getSalary() < 100) {
            System.out.println("Level 2");
        } else {
            System.out.println("wrong input");
        }
    }
}

public class EmployeeMian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the employee id");
        // int empId = Integer.parseInt(sc.nextLine());
        // float emp\Salary = Float.parseFloat(sc.nextLine());

        EmployeeLevel obj1 = new EmployeeLevel();
        // obj1.setEmployee(empId, empSalary);
        obj1.setEmployee(5,3.4f);
        obj1.display();

    }
}
