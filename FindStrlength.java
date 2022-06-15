import java.util.Scanner;

public class FindStrlength {

    static void stringLength(String a) {
        int k = 0;
        for (int i = 0; i < a.length(); i++) {
            ++k;
        }
        System.out.println(k);
    }
    public static void main(String[] args) {
        System.out.println("Enter a string");
        try (Scanner in = new Scanner(System.in)) {
            stringLength(in.nextLine());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
