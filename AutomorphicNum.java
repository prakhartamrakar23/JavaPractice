package JavaPractice;

import java.util.Scanner;

interface NumberInput {

    int getNumber();
}

interface AutomorphicChecker {
    boolean isAutomorphic(int n);
}

class AutomorphicNumber implements NumberInput, AutomorphicChecker {

    // Implementing getNumber method from NumberInput interface
    public int getNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public boolean isAutomorphic(int n) {
        int square = n * n;

        String strN = Integer.toString(n);
        String strSquare = Integer.toString(square);

        // Check if the square ends with the number itself
        return strSquare.endsWith(strN);
    }
}

public class AutomorphicNum {
    public static void main(String[] args) {
        // Create an object of AutomorphicNumber
        AutomorphicNumber automorphicNumber = new AutomorphicNumber();

        // Take the input number
        int n = automorphicNumber.getNumber();

        // Check if the number is automorphic
        if (automorphicNumber.isAutomorphic(n)) {
            System.out.println(n + " is an automorphic number");
        } else {
            System.out.println(n + " is not an automorphic number");
        }
    }
}