package JavaPractice;

import java.util.Scanner;

interface Shape {
    void calculate();
}

class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculate() {
        int area = radius * radius;
        System.out.println("area of circle is " + area);
    }
}

class Rectangle implements Shape {
    private int l;
    private int b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void calculate() {
        int recarea = l * b;
        System.out.println("area of rectangle is " + recarea);
    }
}

public class AreaInterfaceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        int radius = sc.nextInt();
        System.out.println("enter the length");
        int l = sc.nextInt();
        System.out.println("enter the breadth");
        int b = sc.nextInt();
        Shape obj = new Circle(radius);
        Shape obj1 = new Rectangle(l, b);
        obj.calculate();
        obj1.calculate();
    }
}
