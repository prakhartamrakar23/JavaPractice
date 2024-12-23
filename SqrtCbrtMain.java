package JavaPractice;
import java.util.Scanner;

class InnerSqrtCbrt {
    private int num1;
    private double num2;

    public void calculateRoot(int num1) {

        double squareRoot = Math.sqrt(num1);
        System.out.println("Square root " + squareRoot);
    }

    public void calculateRoot(double num2) {
        double cubeRoot = Math.cbrt(num2);
        System.out.println("cube root " + cubeRoot);
    }

}

public class SqrtCbrtMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InnerSqrtCbrt obj = new InnerSqrtCbrt();
        System.out.println("enter the number either int or double ");
        if (sc.hasNextInt()) {
            System.out.println();
            int num1 = sc.nextInt();
            obj.calculateRoot(num1);

        } else if (sc.hasNextDouble()) {
            double num2 = sc.nextDouble();
            obj.calculateRoot(num2);
        }
    }
}
