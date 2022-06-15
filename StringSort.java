import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StringSort {

    static void swap(List<String> arr, int i, int j) {
      String temp = arr.get(i);
      arr.set(i, arr.get(j));
      arr.set(j, temp);
    }

    static int partition(List<String> arr, int low, int high) {

      int i = low - 1;

      for (int j = low; j < high; j++) {
        if (arr.get(j).compareTo(arr.get(high)) < 0) {
          i++;
          swap(arr, i, j);
        }
      }
      swap(arr, i+1, high);
      return i+1;
    }

    static void quickSort(List<String> arr, int low, int high) {
      if (low < high) {
        int p = partition(arr, low, high);

        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
      }
    }
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
          System.out.println("Enter the size of array: ");
          int n = in.nextInt();
          List<String> arr = new ArrayList<>();
          for (int i = 0; i < n; i++) {
            System.out.println("Enter arr[" + i + "]");
            arr.add(in.next());
          }
          quickSort(arr, 0, arr.size() - 1);
          System.out.println(arr);
        } catch (Exception e) {
          System.out.println(e);
        }
      }
}
