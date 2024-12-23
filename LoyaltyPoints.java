package JavaPractice;

import java.util.Scanner;

class Loyalty {
    private int amount;
    private String ans;

    // if regular customer
    public void calculateLoyalty(int amount, String ans) {
        double LoyaltyPoints = amount / 10;
        System.out.println("Regular customers: " + LoyaltyPoints);
    }

    // if premium customer
    public void calculateLoyalty(String ans, int amount) {
        double LoyaltyPoints = 2 * (amount / 10);
        System.out.println("Premium customers: " + LoyaltyPoints);
    }

}

public class LoyaltyPoints {
    public static void main(String[] args) {
        Loyalty obj = new Loyalty();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the amount ");
        int amount = Integer.parseInt(sc.nextLine());
        System.out.println("enter that you are premium customer or not (yes/no)");
        String ans = sc.nextLine();
        if (ans.equals("yes") || ans.equals("Yes")) {
            obj.calculateLoyalty(ans, amount);
        } else if (ans.equalsIgnoreCase("no")) {
            obj.calculateLoyalty(amount, ans);
        }
    }
}
