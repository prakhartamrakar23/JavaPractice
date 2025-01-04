package AjaySirAssing.StringAss;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (Character.isAlphabetic(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        scanner.close();
    }
}
