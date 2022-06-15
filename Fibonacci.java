import java.util.Scanner;

public class Fibonacci {
    static int fib(int n) {
        int arr[] = new int[n + 2];
        
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the limit");
            int n = in.nextInt();
            for (int i = 0; i < n; i++ ) {
                System.out.print(fib(i) + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
