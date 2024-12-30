package JavaPractice;
//here we use static because we not want to make objct or implements interface in any class.
interface I1 {
    static void hello() {
        System.out.println("static hello method");
    }
}

public class InterStatic {
    public static void main(String[] args) {
        I1.hello();
    }
}
