package AjaySirAssing.StringAss;

public class StringMethodsExample {
    public static void main(String[] args) {
        String s = "   Hello, Java String Methods!    ";

        // 1. trim() - Removes leading and trailing whitespace
        System.out.println("1. trim(): " + s.trim() + " ");

        // 2. toLowerCase() - Converts all characters to lowercase
        System.out.println("2. toLowerCase(): '" + s.toLowerCase() + "'");

        // 3. toUpperCase() - Converts all characters to uppercase
        System.out.println("3. toUpperCase(): '" + s.toUpperCase() + "'");

        // 4. toCharArray() - Converts the string to a char array
        char[] chars = s.toCharArray();
        System.out.print("4. toCharArray(): ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 5. replace() - Replaces all occurrences of a substring with another substring
        System.out.println("5. replace(): '" + s.replace("Java", "Python") + "'");

        // 6. substring() - Extracts a substring from a string
        System.out.println("6. substring(): '" + s.substring(7, 11) + "'");

        // 7. charAt() - Returns the character at a specified index
        System.out.println("7. charAt(): " + s.charAt(0));

        // 8. length() - Returns the length of the string
        System.out.println("8. length(): " + s.length());

        // 9. contains() - Checks if a substring is present in the string
        System.out.println("9. contains(): " + s.contains("Java"));

        // 10. startsWith() - Checks if the string starts with a specific prefix
        System.out.println("10. startsWith(): " + s.startsWith("   Hello"));

        // 11. endsWith() - Checks if the string ends with a specific suffix
        System.out.println("11. endsWith(): " + s.endsWith("Methods!    "));

        // 12. indexOf() - Returns the index of the first occurrence of a character or
        // substring
        System.out.println("12. indexOf(): " + s.indexOf("Java"));

        // 13. lastIndexOf() - Returns the index of the last occurrence of a character
        // or substring
        System.out.println("13. lastIndexOf(): " + s.lastIndexOf('o'));

        // 14. isEmpty() - Checks if the string is empty
        System.out.println("14. isEmpty(): " + s.isEmpty());

        // 15. equals() - Compares two strings for equality
        System.out.println("15. equals(): " + s.equals("Hello, Java String Methods!"));

        // 16. equalsIgnoreCase() - Compares two strings for equality, ignoring case
        System.out.println("16. equalsIgnoreCase(): " + s.equalsIgnoreCase("   hello, java string methods!    "));

        // 17. format() - Returns a formatted string
        String formattedString = String.format("Name: %s, Age: %d", "John", 30);
        System.out.println("17. format(): " + formattedString);

        // 18. isBlank() - Checks if the string is empty or only contains whitespace
        System.out.println("18. isBlank(): " + "   ".isBlank());

        // 19. repeat() - Repeats the string a specified number of times
        System.out.println("19. repeat(): " + "abc".repeat(3));

        // 20. split() - Splits the string into an array of substrings
        String[] words = s.split(" ");
        System.out.print("20. split(): ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        // 21. matches() - Checks if the string matches a regular expression
        System.out.println("21. matches(): " + s.matches(".Java."));

        // 22. compareTo() - Compares two strings lexicographically
        System.out.println("22. compareTo(): " + "apple".compareTo("banana"));

        // 23. compareToIgnoreCase() - Compares two strings lexicographically, ignoring
        // case
        System.out.println("23. compareToIgnoreCase(): " + "apple".compareToIgnoreCase("Apple"));

        // 24. valueOf() - Converts other types to a string
        System.out.println("24. valueOf(): " + String.valueOf(123));

        // 25. regionMatches() - Compares a specific region of two strings
        System.out.println("25. regionMatches(): " + s.regionMatches(7, "Java", 0, 4));

        // 26. intern() - Returns the canonical representation of the string
        String s1 = new String("Hello");
        System.out.println("26. intern(): " + s1.intern());

        // 27. strip() - Removes leading and trailing white spaces (Unicode-aware)
        System.out.println("27. strip(): '" + s.strip() + "'");

        // 28. stripLeading() - Removes leading white spaces
        System.out.println("28. stripLeading(): '" + s.stripLeading() + "'");

        // 29. stripTrailing() - Removes trailing white spaces
        System.out.println("29. stripTrailing(): '" + s.stripTrailing() + "'");

        // 30. lines() - Returns a stream of lines from the string (useful for
        // multi-line strings)
        System.out.println("30. lines():");
        s.lines().forEach(System.out::println);

        // 31. toString() - Returns the string itself (for objects)
        System.out.println("31. toString(): " + s.toString());

        // 32. contains() - Checks if the string contains a specific substring
        System.out.println("32. contains(): " + s.contains("Java"));

        // 33. concat() - Concatenates two strings
        System.out.println("33. concat(): " + "Hello".concat(" World"));

        // 34. subSequence() - Returns a subsequence of the string
        System.out.println("34. subSequence(): " + s.subSequence(7, 12));

        // 35. offsetByCodePoints() - Returns the index of a code point relative to
        // another index
        System.out.println("35. offsetByCodePoints(): " + s.offsetByCodePoints(7, 5));

        // 36. getBytes() - Encodes the string into a byte array
        byte[] byteArray = s.getBytes();
        System.out.print("36. getBytes(): ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();

        // 37. codePointAt() - Returns the Unicode code point at a specific index
        System.out.println("37. codePointAt(): " + s.codePointAt(0));

        // 38. codePointCount() - Returns the number of Unicode code points in the
        // string
        System.out.println("38. codePointCount(): " + s.codePointCount(0, s.length()));

        // 39. getChars() - Copies characters from the string into a character array
        char[] dest = new char[10];
        s.getChars(0, 5, dest, 0);
        System.out.print("39. getChars(): ");
        for (char c : dest) {
            System.out.print(c);
        }
        System.out.println();

        // 40. isPalindrome (Custom method) - Checks if the string is a palindrome
        System.out.println("40. isPalindrome(): " + isPalindrome("madam"));
    }

    // Custom method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}