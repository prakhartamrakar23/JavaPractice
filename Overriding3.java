package JavaPractice;
/* there is no dynamic binding for static it is a method of class type
(means there is no overriding in static method.)But we can redefine static method means if there is static method in parent then 
the child class method must be static. */
class A {
    static void sum() {
        System.out.println("sum of A class");
    }
}

class B extends A {
static void sum() {
System.out.println("sum of B class");
}
}

// here it gives error because the parent is static and the child class must be
// static

/*
 * class B extends A {
 * void sum() {
 * System.out.println("sum of B class");
 * }
 * }
 */
public class Overriding3 {
    public static void main(String[] args) {
        A obj1 = new B();
        obj1.sum(); // here there is no overriding happening
    }
}
