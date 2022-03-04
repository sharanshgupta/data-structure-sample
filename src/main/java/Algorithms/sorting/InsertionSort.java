package Algorithms.sorting;

import java.time.LocalDateTime;

public class InsertionSort {

  public static void main(String[] args) {
    System.out.println(LocalDateTime.now());

    int [] arr = {20, 10, -15, 7, 55, 1, -22};

    //Insertion Sort -
    for (int i = 1; i < arr.length; i++) {
      for(int j = i; j>0; j--){
        if(arr[j] > arr[j-1]){
          break;
        }
        if(arr[j] < arr[j-1]) {
          swap(arr, j);
        }
      }
      for (int k = 0; k < arr.length; k++) {
        System.out.print(arr[k] + ",");
      }
      System.out.println("");
    }

    System.out.println(LocalDateTime.now());

    for (int i = 0; i< arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("");
  }

  private static void swap(int[] arr, int j) {
    int temp = arr[j -1];
    arr[j -1] = arr[j];
    arr[j] = temp;
  }
}
