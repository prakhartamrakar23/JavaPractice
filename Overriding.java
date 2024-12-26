package JavaPractice;

// simple overriding 
class A{
    void sum(){
        System.out.println("this is A class sum");
    }
}
class B extends A{
    void sum(){
        System.out.println("this is B class sum");
    }
}

public class Overriding {
    public static void main(String[] args) {
        A obj1=new B();
        obj1.sum();
    }
}
