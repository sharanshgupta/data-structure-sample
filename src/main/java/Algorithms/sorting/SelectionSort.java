package Algorithms.sorting;

import java.time.LocalDateTime;

public class SelectionSort {

  public static void main(String[] args) {
    System.out.println(LocalDateTime.now());

    int [] arr = {20, 35, -15, 7, 55, 1, -22};
    int largest = 0;

    //Selection Sort -
    for (int i = arr.length - 1; i > 0; i--) {
      for(int j = 0; j<=i; j++){
        if(arr[j] > arr[largest]) {
          largest = j;
        }
      }
      swapLastIndexOfLoopWithLargest(arr, largest, i);
      largest = 0;
      for (int k = 0; k< arr.length; k++) {
        System.out.print(arr[k] + " ");
      }
      System.out.println();
    }

    System.out.println(LocalDateTime.now());

    for (int i = 0; i< arr.length; i++) {
      System.out.println("Value at index " + i + " is " + arr[i]);
    }
  }

  private static void swapLastIndexOfLoopWithLargest(int[] arr, int largest, int i) {
    int temp = arr[i];
    arr[i] = arr[largest];
    arr[largest] = temp;
  }
}
