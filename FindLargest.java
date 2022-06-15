import java.util.ArrayList;
import java.util.Scanner;

public class FindLargest {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("\n Enter the size of array: ");
            int n = in.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(in.nextInt());
            }
            
            int maximum = 0;
            for (int item : arr) {
                if (item > maximum) maximum = item;
            }
            System.out.println(maximum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
