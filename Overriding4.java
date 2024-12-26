package JavaPractice;
//in case of attributes(data members) there is no dynamic binding.

class A {
    int id = 900;
}

class B extends A {
    int id = 800;
}

public class Overriding4 {
    public static void main(String[] args) {
        A obj = new B();
        int id = obj.id;
        System.out.println(id);
    }
}
