package ObjectClass;
package ObjectClass;

import java.util.Objects;

class Person {
    int id;
    String name;
    double salary;

    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

}

public class ObjectString {
    public static void main(String[] args) {
        Person p1 = new Person(101, "prakhar", 50000);
        Person p2 = new Person(101, "prakhar", 50000);
        System.out.println(p1);
        System.out.println(p2);
    }

}
