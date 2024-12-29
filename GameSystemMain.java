package JavaPractice;

import java.util.Scanner;

abstract class GameCharacter {

    int getPower() {
        return magicPower;
    }

    abstract void attack();

    abstract void defend();
}

class Warrior extends GameCharacter {
    private int strength;

    public Warrior(int strength) {
        this.strength = strength;
    }

    void attack() {
        int result = strength * 3;
        System.out.println(" Powerful sword slash for" + result + " damage! ");
    }

    void defend() {
        System.out.println("Raises shield, defence boosted by " + strength);
    }
}

class Wizards extends GameCharacter {

    private int magicPower;

    public Wizards(int magicPower) {
        this.magicPower = magicPower;
    }

    void attack() {
        int result = magicPower * 2;
        System.out.println(" Casts spell, deals " + result + " magical damage!");
    }

    void defend() {
        System.out.println("Creates magical barrier, defence boosted by " + magicPower);
    }
}

public class GameSystemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice character 1 for Warrior and 2 for Wizard: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("enter the strength you want in your character");
                int s = sc.nextInt();
                if (s <= 106 && s >= 1) {
                    GameCharacter obj1 = new Warrior(s);
                    System.out.println("Warrior Actions:");
                    obj1.attack();
                    obj1.defend();
                }

                break;

            case 2:
                System.out.println("enter the strength you want in your character");
                int m = sc.nextInt();
                if (m >= 1 && m <= 106) {
                    GameCharacter obj2 = new Wizards(m);
                    System.out.println("Wizard Actions:");
                    obj2.attack();
                    obj2.defend();
                }

                break;
            default:
                System.out.println("invalid choice");
                break;
        }
    }
}
