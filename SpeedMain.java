package JavaPractice;

class Vehicle {
    void speed() {
        System.out.println("speed varries for different vehicles");
    }
}

class Car extends Vehicle {
    void speed() {
        System.out.println("Car speed is 120km/hr");
    }
}

class Bike extends Vehicle {
    void speed() {
        System.out.println("Bike speed is 80 km/hr");
    }
}

public class SpeedMain {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        Vehicle obj1 = new Bike();
        Vehicle obj2 = new Car();

        obj.speed();
        obj1.speed();
        obj2.speed();
    }
}
