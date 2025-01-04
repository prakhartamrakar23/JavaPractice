package AjaySirAssing.StringAss;

import java.util.Scanner;

public class CountSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.nextLine();
        int count = 0;
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
