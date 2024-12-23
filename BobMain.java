package JavaPractice;
import java.util.Scanner;

class Calculate {
    private int radius;
    private double Radius;

    //method for circumference
    public void calculateCircumference(int radius, double Radius) {
        this.radius = radius;
        this.Radius = Radius;
        System.out.println("Circumference " + (2 * 3.14 * radius) + " " + (2 * 3.14 * Radius));
    }

   
//method for area (overloaded by changing order of the arguments)
    public void calculateArea(double Radius, int radius) {
        this.radius = radius;
        this.Radius = Radius;
        System.out.println("Area " + (3.14 * radius * radius) + " " + (3.14 * Radius * Radius));
    }

}
//main class
public class BobMain {
    public static void main(String[] args) {
        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius in integer");
        int radius = sc.nextInt();
        System.out.println("enter the radius in the double");
        double Radius = sc.nextDouble();

        Calculate obj1 = new Calculate();
        obj1.calculateCircumference(radius, Radius);
        obj1.calculateArea(Radius, radius);
    }
}
