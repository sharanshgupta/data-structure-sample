package Algorithms.sorting;

import java.time.LocalDateTime;

public class BubbleSort {

  public static void main(String[] args) {

    System.out.println(LocalDateTime.now());

    int [] arr = {20, 35, -15, 7, 55, 7, -22};

    //Bubble Sort -
    for (int i = arr.length - 1; i > 0; i--) {
      for(int j = 0; j<i; j++){
        if(arr[j] > arr[j+1]) {
          swap(arr, j);
        }
      }
    }

    System.out.println(LocalDateTime.now());

    for (int i = 0; i< arr.length; i++) {
      System.out.println("Value at index " + i + " is " + arr[i]);
    }
  }

  private static void swap(int[] arr, int j) {
    int temp = arr[j +1];
    arr[j +1] = arr[j];
    arr[j] = temp;
  }
}
