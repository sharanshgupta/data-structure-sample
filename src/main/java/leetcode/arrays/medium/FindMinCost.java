package leetcode.arrays.medium;

import java.util.Map.Entry;
import java.util.TreeMap;

public class FindMinCost {

  public static void main(String[] args) {
    int[] nums = {5,2,4,6,3,7};
    FindMinCost findMinCost = new FindMinCost();
    System.out.println(findMinCost.solution(nums));
  }

  public int solution(int[] A) {
    TreeMap<Integer, Integer> map = new TreeMap<>();

    for (int i = 0; i < A.length; i++) {
      map.put(A[i], i);
    }

    Entry<Integer, Integer> entryOne = map.firstEntry();
    map.remove(entryOne.getKey());
    Entry<Integer, Integer> entryTwo = map.firstEntry();

    if((entryTwo.getValue() - entryOne.getValue()) > 1) {
      return entryOne.getKey() + entryTwo.getKey();
    } else {
      map.remove(entryTwo.getKey());
      Entry<Integer, Integer> entryThree = map.firstEntry();
      return entryOne.getKey() + entryThree.getKey();
    }
  }
}
