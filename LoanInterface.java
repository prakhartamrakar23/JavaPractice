package JavaPractice;

import java.util.Scanner;

interface Principal {
    void principal();
}

interface InterestRate {
    void interestrate();
}

class Loan implements Principal, InterestRate {

    private double principal;
    private double interestrate;
    private int years;

    public Loan(double principal, double interestrate, int years) {
        this.principal = principal;
        this.interestrate = interestrate;
        this.years = years;
    }

    public void principal() {
        System.out.println(principal);
    }

    public void interestrate() {
        System.out.println(interestrate);
    }

    public void calculateTotalInterest() {
        double result = principal * interestrate * years;
        System.out.printf("Total interest paid: Rs.%.2f\n", result);
    }
}

public class LoanInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal");
        double principal = sc.nextDouble();
        System.out.println("enter the rate of interest");
        double interestrate = sc.nextDouble();
        System.out.println("enter the loan duration (time)");
        int years = sc.nextInt();
        // Input validation
        if (principal <= 0 || interestrate <= 0 || interestrate > 0.99 || years <= 0 || years >= 25) {
            System.out.println("Invalid input values!");
            return;
        }
        Loan obj = new Loan(principal, interestrate, years);
        obj.calculateTotalInterest();

        sc.close();

    }
}
