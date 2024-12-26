package JavaPractice;


//if there is a access specifier in the parent class then it should be same as parent or access privilege should be greater then parent.
//(in case of private there should be no overriding).
class A {
    public void sum() {
        System.out.println("sum of A class");
    }
}

class B extends A {
    public void sum() {

        System.out.println("B class sum()");
    }
}

public class Overriding1 {
    public static void main(String[] args) {
        A obj1 = new B();
        obj1.sum();
    }
}
