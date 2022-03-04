package leetcode.arrays.easy;

public class SumOfAllTwoDigitIntegers {

  public static void main(String[] args) {
    int[] arr = {2, 5, -66, 23};
    SumOfAllTwoDigitIntegers sum = new SumOfAllTwoDigitIntegers();
    System.out.println(sum.getSum(arr));
  }

  public int getSum(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      if(Math.abs(i) > 9) {
        sum += i;
      }
    }
    return sum;
  }
}
