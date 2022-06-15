import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String a) {
        String lowA = a.toLowerCase();
        int j = a.length() - 1;
        for (int i = 0; i <= j; i++, j--) {
            if (lowA.charAt(i) != lowA.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a string");
        try (Scanner in = new Scanner(System.in)) {
            boolean result = isPalindrome(in.nextLine());
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
