package Algorithms.sorting;

import java.time.LocalDateTime;

public class MergeSort {

  public static void main(String[] args) {
    System.out.println(LocalDateTime.now());

    int [] arr = {20, 10, -15, 7, 55, 1, -22};

    sort(arr, 0, arr.length);

    for (int k = 0; k < arr.length; k++) {
      System.out.print(arr[k] + ",");
    }
    System.out.println("");
  }

  public static void sort(int[] input, int start, int end) {

    if(end - start < 2) {
      return;
    }

    int mid = (start + end) / 2;
    sort(input, start, mid);
    sort(input, mid, end);
    merge(input, start, mid, end);
  }

  public static void merge(int[] input, int start, int mid, int end) {

    if(input[mid - 1] <= input[mid]){
      return;
    }

    int i = start;
    int j = mid;
    int tempIndex = 0;

    int[] temp = new int[end - start];

    while(i < mid && j < end) {
      temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
    }
    System.arraycopy(input, i, input, start +tempIndex, mid - i);
    System.arraycopy(temp, 0, input, start, tempIndex);
  }

}
