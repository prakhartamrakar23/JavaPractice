package JavaPractice;

import java.applet.Applet;

abstract class Appliance {
    private String brand;
    private boolean isOn = false;

    public Appliance() {
    };

    public Appliance(String brand) {
        this.brand = brand;
    }

    // abstract method
    abstract void operate();

    void turnOn() {
        this.isOn = true;
        System.out.println("the appliance is on now");
    }

    void turnOff() {
        this.isOn = false;
        System.out.println("the appliance is off now");
    }
}

class WashingMachine extends Appliance {

    @Override
    void operate() {
        System.out.println("The washing machine is washing clothes");

    }
}

class Refrigerator extends Appliance {

    @Override
    void operate() {
        System.out.println("The refrigerator is cooling items");

    }
}

// main class
public class ApplianceMain {
    public static void main(String[] args) {

        Appliance obj1 = new WashingMachine();
        Appliance obj2 = new Refrigerator();

        System.out.println("Washing Machine:");
        obj1.turnOn();
        obj1.operate();
        obj1.turnOff();

        System.out.println("\nRefrigerator:");
        obj2.turnOn();
        obj2.operate();
        obj2.turnOff();

    }
}