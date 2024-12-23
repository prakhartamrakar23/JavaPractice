
class Person {

    String firstName;
    String lastName;

    // setter method
    void set(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getter method
    void display() {
        System.out.println("Name: " + firstName + " " + lastName);
    }
}

class Employee extends Person {
    int empId;
    String jobTitle;

    void set(String firstName, String lastName, String jobTitle, int empid) {
        super.set(firstName, lastName);
        this.empId = empid;
        this.jobTitle = jobTitle;
    }

    void display() {
        super.display();
        System.out.println("EmployeeId: " + empId + "\n " + jobTitle);

    }

}

public class Demo13 {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.set("ram", "raghuwanshi", "owner", 101);
        obj1.display();
    }
}
