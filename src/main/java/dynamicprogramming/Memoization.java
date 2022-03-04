package dynamicprogramming;

import java.util.HashMap;

public class Memoization {

  private HashMap<Integer, Integer> cache = new HashMap<>();

  public int addTo80(int n) {
    System.out.println("Some hypothetical function taking long time");
    return n + 80;
  }

  public int memoizedAddTo80(int n) {
    if(cache.containsKey(n)) {
      return cache.get(n);
    } else {
      System.out.println("Some hypothetical function taking long time");
      int result = n + 80;
      cache.put(n, result);
      return result;
    }
  }

  public static void main(String[] args) {

    Memoization memo = new Memoization();

    System.out.println("addTo80: " + memo.addTo80(5));

    System.out.println("\nNow calling memoized function");
    System.out.println("memoizeAddTo80: " + memo.memoizedAddTo80(5));
    System.out.println("memoizeAddTo80: " + memo.memoizedAddTo80(5));
    System.out.println("memoizeAddTo80: " + memo.memoizedAddTo80(5));
  }

}
