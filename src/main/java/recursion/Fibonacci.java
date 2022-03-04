package recursion;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Fibonacci {

  private static int recursiveCallCounter = 0;

  public static void main(String[] args) {
    fibonacciIterative(5); // O(n)

    System.out.println(LocalDateTime.now());
    System.out.println(fibonacci(5)); // O(2^n)
    System.out.println(LocalDateTime.now());
    System.out.println("Total recursive calls -> " + recursiveCallCounter);
  }

  private static void fibonacciIterative(int i) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(0);
    arr.add(1);

    while (arr.size() < i) {
      int newNum = arr.get(arr.size() - 1) + arr.get(arr.size() - 2);
      arr.add(newNum);
    }
    System.out.println("Iterative Fibonacci -> " + arr);
  }

  private static int fibonacci(int n) {
    recursiveCallCounter++;
    if (n < 2) {
      return n;
    }
    return fibonacci(n-1) + fibonacci(n-2);
  }
}
