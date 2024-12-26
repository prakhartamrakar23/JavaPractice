package JavaPractice;

class Animal {
    void makeSound() {

        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof Woof");
    }

}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow Meow   ");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal obj = new Animal();
        Animal obj1 = new Cat();
        Animal obj2 = new Dog();
        obj.makeSound();
        obj1.makeSound();
        obj2.makeSound();
    }
}
