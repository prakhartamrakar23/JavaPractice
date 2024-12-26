package JavaPractice;

import java.util.Scanner;

class Shape {
    void calculateArea() {
        System.out.println("Area calculation not define for shape");
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("calculated area of circle " + area);
    }

}

class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        int rectangleArea = length * width;
        System.out.println("calculted area of rectangle " + rectangleArea);
    }
}

public class ShapeAreaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape arr[] = new Shape[3];
        System.out.println("enter the radius of circle");
        double radius = sc.nextInt();
        arr[0] = new Circle(radius);

        System.out.println("enter the length and width of rectangle ");
        int length = sc.nextInt();
        int width = sc.nextInt();
        arr[1] = new Rectangle(length, width);

        arr[2] = new Shape();
        for (Shape shape : arr) {
            shape.calculateArea();
        }

    
    }
}
