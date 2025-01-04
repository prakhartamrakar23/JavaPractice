package AjaySirAssing.StringAss;

public class ReverseString {
    public static void main(String[] args) {
        String str = "jav a";
        char arr[] = str.toCharArray();
        for (int i = arr.length - 1; i >=0; i--) {
            if (arr[i] == ' ') {
                continue;
            } else {
                System.out.print(arr[i]);
            }
        }
    }
}
