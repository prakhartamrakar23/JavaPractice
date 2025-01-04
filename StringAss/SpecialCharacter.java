package AjaySirAssing.StringAss;

import java.util.Scanner;

public class SpecialCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '@' || arr[i] == '#' || arr[i] == '$') {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("contains special characters");
        } else {
            System.out.println("not contains");
        }
    }

}
