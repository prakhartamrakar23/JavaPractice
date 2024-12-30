package JavaPractice;

interface I1 {
    private void m1() {
        System.out.println("it is the private method...");
    }

    default void m2() {
        m1();
    }
}

class A implements I1 {

}

public class InterPrivate {
    public static void main(String[] args) {
        I1 obj = new A();
        obj.m2();
    }
}
