package leetcode.arrays.medium;

/*
Write a function:
class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
*/

import java.util.TreeSet;

public class SmallestPossibleIntNotInArray {

  public static void main(String[] args) {
    int[] nums = {1, 3, 6, 4, 1, 2};
    SmallestPossibleIntNotInArray num = new SmallestPossibleIntNotInArray();
    System.out.println(num.solution(nums));
  }

  public int solution(int[] arr) {
    TreeSet<Integer> sortedList = new TreeSet<>();
    for (int i : arr) {
      if(i > 0) {
        sortedList.add(i);
      }
    }

    if (sortedList.isEmpty()) {
      return 1;
    } else {
      int valueToReturn = 1;
      for (int i : sortedList) {
        if (valueToReturn == i) {
          valueToReturn++;
        } else {
          return valueToReturn;
        }
      }
      return valueToReturn;
    }
  }
}
