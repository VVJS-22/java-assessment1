import java.util.Scanner;

class QuickSort {

    static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {

      int i = low - 1;

      for (int j = low; j < high; j++) {
        if (arr[j] < arr[high]) {
          i++;
          swap(arr, i, j);
        }
      }
      swap(arr, i+1, high);
      return i+1;
    }

    static void quickSort(int[] arr, int low, int high) {
      if (low < high) {
        int p = partition(arr, low, high);

        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
      }
    }
    
    static void printArray(int arr[]) {
      int n = arr.length;
      for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");
      System.out.println();
    }

    public static void main(String args[]) {
      try (Scanner in = new Scanner(System.in)) {
        System.out.println("Enter the size of array: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
          System.out.println("Enter arr[" + i + "]");
          arr[i] = in.nextInt();
        }
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
    
        System.out.println("Sorted array:");
        printArray(arr);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }