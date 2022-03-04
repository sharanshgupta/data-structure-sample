package leetcode.arrays.easy;

import java.util.Arrays;

public class FindMinPositiveMissingInteger {

  public static void main(String[] args) {
    int[] arr = new int[]{-6, -4, -2, -3, -3, -1};
    FindMinPositiveMissingInteger find = new FindMinPositiveMissingInteger();
    System.out.println("ans -> " + find.firstMissingPositive(arr));
  }

  public int firstMissingPositive(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < 1 || nums[i] > nums.length) {
        nums[i] = 1;
      }
    }
    int exp=2;
    nums = Arrays.stream(nums).sorted().toArray();
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
    if(nums[0] != 1 || nums[nums.length-1] == 1) {
      return 1;
    }
    for (int i = 1; i < nums.length; i++) {
      System.out.println("arr -> " + nums[i] + " || exp -> " + exp + " || i -> " + i);
      if (nums[i] != nums[i-1]) {
        if (nums[i] != exp) {
          return exp;
        } else {
          exp++;
        }
      }
    }
    return exp;
//    TreeSet<Integer> treeSet = new TreeSet<Integer>();
//    for (int num : nums) {
//      if (num > 0)
//      treeSet.add(num);
//    }
//    int  current = treeSet.first();
//    for (int i = 0; i < nums.length; i++) {
//      if (current != treeSet.first()){
//        break;
//      } else {
//        treeSet.remove(current);
//      }
//      current++;
//    }
//    if (current < 1)
//      return 1;
//    else
//      return current;
  }
}
