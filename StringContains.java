import java.util.Scanner;

public class StringContains {
    static void contains (String a) {
        int upperCase = 0, lowerCase = 0, special = 0, digits = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                ++upperCase;
            } else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                ++lowerCase;
            } else if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                ++digits;
            } else {
                ++special;
            }
        }

        System.out.println("Upper Case: " + upperCase);
        System.out.println("Lower Case: " + lowerCase);
        System.out.println( "Digits: " + digits);
        System.out.println("Special Characters: " + special);
    }
    public static void main(String[] args) {
        System.out.println("Enter a string");
        try (Scanner in = new Scanner(System.in)) {
            contains(in.nextLine());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
