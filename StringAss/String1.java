package AjaySirAssing.StringAss;

public class String1 {
    public static void main(String[] args) {
        String str = "madam";

        char arr[] = str.toCharArray();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[i] == arr[j]) {
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println("palindrome ");
        } else {
            System.out.println("not palindrome");
        }
    }
}
