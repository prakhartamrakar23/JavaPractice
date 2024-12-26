package JavaPractice;
/* if the return is of class type then the return type should be same or not then there should be relation between the parent and 
child classes and there is herarichy there. */
class Person {

}

class Employee extends Person {

}

class A {

    Person sum() {
        System.out.println("sum of A class");
        return null;
    }
}
// here there is relation b/w person and child and Person can access Employee but its opposite can not be happen
class B extends A {
    Employee sum() {

        System.out.println("B class sum()");
        return null;
    }
}

public class Overriding2 {
    public static void main(String[] args) {
        A obj1 = new B();
        obj1.sum();
    }
}
