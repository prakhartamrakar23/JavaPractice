package ObjectClass;

class Person {
    int id;
    String name;
    double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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
// this is auto generate code

    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj)
    // return true;
    // if (obj == null)
    // return false;
    // if (getClass() != obj.getClass())
    // return false;
    // Person other = (Person) obj;
    // if (id != other.id)
    // return false;
    // if (name == null) {
    // if (other.name != null)
    // return false;
    // } else if (!name.equals(other.name))
    // return false;
    // if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
    // return false;
    // return true;
    // }

    //here we override equals method
    boolean equals(Person p) {
        return this.id == p.id && this.name.equals(p.name) && this.salary == p.salary;
    }

}

public class ObjectEquals {
    public static void main(String[] args) {
        Person p1 = new Person(101, "prakhar", 30000);
        Person p2 = new Person(101, "prakhar", 30000);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));
    }
}
