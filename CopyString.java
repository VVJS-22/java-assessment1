import java.util.Scanner;

public class CopyString {

    static void copy(String a) {
        String b ="";
        for (int i = 0; i < a.length(); i++) {
            b += a.charAt(i);
        }
        System.out.println(b);
    }
    public static void main(String[] args) {
        System.out.println("Enter a string");
        try (Scanner in = new Scanner(System.in)) {
            copy(in.nextLine());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
