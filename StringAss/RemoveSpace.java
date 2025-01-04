package AjaySirAssing.StringAss;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "I love java";
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                continue;
            }
            System.out.print(arr[i]);
        }
    }
}
