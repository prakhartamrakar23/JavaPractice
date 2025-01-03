package JavaPractice;

import java.util.Scanner;

interface NumberInput {
    void numInput(int n);
}

interface AutomorphicChecker {
    default void checker(int n) {
        int rem = 0, res = 1, d = 0;
        int temp = n;
        int count = 0;

        while (temp > 0) {
            int r = temp % 10;
            count++;
            temp = temp / 10;
        }

        for (int i = 1; i <= count; i++) {
            res = res * 10;
        }
        d = n * n;
        rem = d % res;
        if (n == rem) {
            System.out.printf("%d is an automorphic Number. ", n);
        } else {
            System.out.printf("%d is not an automorphic number. ", n);
        }
    }
}

public class Automorphic1 implements NumberInput, AutomorphicChecker {
    int num;

    public void numInput(int n) {
        this.num = n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value to check No. is an automorphic or not...");
        int n = sc.nextInt();
        if (n < 1 || n > 500) {
            System.out.println("please enter the valid number....Between 1 to 500.");
            return;
        } else {
            Automorphic1 obj = new Automorphic1();
            obj.numInput(n);
            obj.checker(n);
        }
    }
}
