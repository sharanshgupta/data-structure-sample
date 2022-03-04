package datastructures.arrays;

// merge two sorted arrays so that final result is a merged sorted array.
// example: [3, 5, 9] and [2, 4, 6, 8, 10, 11] when merged gives output:
// [2, 3, 4, 5, 6, 8, 9, 10, 11]

import java.util.Arrays;

public class MergeTwoSortedArrays {

  public static void main(String[] args) {
    int [] inArr1 = {3, 5, 9};
    int [] inArr2 = {2, 4, 6, 8, 10, 11};
    mergeTwoSortedArrays(inArr1, inArr2);
  }

  private static void mergeTwoSortedArrays(int[] arr1, int[] arr2) {
    int i = 0; // Index count of arr1
    int j = 0; // Index count of arr2
    int k = 0; // Index count of merged array.
    int [] out = new int[arr1.length + arr2.length]; // New merged array with length as sum of lengths of both array

    //Compare and add smaller element to the merged array
    while(i < arr1.length && j < arr2.length) {

      if(arr1[i] < arr2[j]) {
        out[k] = arr1[i];
        i++;
      } else {
        out[k] = arr2[j];
        j++;
      }
      k++;
    }

    while(i < arr1.length) {
      out[k] = arr1[i];
      i++;
      k++;
    }

    while(j < arr2.length) {
      out[k] = arr2[j];
      j++;
      k++;
    }

    System.out.println(Arrays.toString(out));

  }

}
