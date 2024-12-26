package JavaPractice;

class A {
    int a;
}

class B extends A {
    int a;
    int c;

    void set(int x, int y) {
        super.a = x;
        a = y;
    }

    void sum() {
        c = super.a + a;
    }

    void display() {
        System.out.println(c);
    }
}

public class SuperCode {
    public static void main(String[] args) {
        B obj = new B();
        obj.set(100, 200);
        obj.sum();
        obj.display();
    }
}
