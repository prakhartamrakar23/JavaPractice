package JavaPractice;

class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    void display() {
        super.display();
        System.out.println("class B");
    }
}

public class SuperCode2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
