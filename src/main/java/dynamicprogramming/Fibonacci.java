package dynamicprogramming;

import java.util.HashMap;

public class Fibonacci {

  private HashMap<Integer, Integer> cache = new HashMap<>();
  private int recursiveCallCounter = 0;

  public static void main(String[] args) {
    Fibonacci fibonacci = new Fibonacci();

    System.out.println(fibonacci.fibonacci(20));
    System.out.println(fibonacci.recursiveCallCounter);
  }

  public int fibonacci(int n) {
    recursiveCallCounter++;

    if(cache.containsKey(n)) {
      return cache.get(n);
    }

    if (n < 2) {
      return n;
    }
    int result = fibonacci(n - 1) + fibonacci(n - 2);
    cache.put(n, result);
    return result;
  }
}
