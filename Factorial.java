import java.util.Scanner;

public class Factorial {
    static int computeFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++ ) {
            factorial*=i;
        }

        return factorial;
    }
    public static void main(String[] args) {
        System.out.println("Enter an Integer");
        try (Scanner in = new Scanner(System.in)) {
            int result = computeFactorial(in.nextInt());
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
