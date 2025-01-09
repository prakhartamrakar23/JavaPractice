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

    @Override
    public int hashCode() {
       return Objects.hash(id, name , salary);
        // return id ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        return true;
    }

}

public class ObjectHashcode {
    public static void main(String[] args) {
        Person p1 = new Person(101, "prakhar", 50000);
        Person p2 = new Person(101, "prakhar", 50000);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

    }
}
