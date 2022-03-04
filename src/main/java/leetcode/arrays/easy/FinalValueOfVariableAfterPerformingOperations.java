package leetcode.arrays.easy;

/*
  There is a programming language with only four operations and one variable X:
  ++X and X++ increments the value of the variable X by 1.
  --X and X-- decrements the value of the variable X by 1.
  Initially, the value of X is 0.

  Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

  Example 1:

  Input: operations = ["--X","X++","X++"]
  Output: 1
  Explanation: The operations are performed as follows:
  Initially, X = 0.
  --X: X is decremented by 1, X =  0 - 1 = -1.
  X++: X is incremented by 1, X = -1 + 1 =  0.
  X++: X is incremented by 1, X =  0 + 1 =  1.
*/

public class FinalValueOfVariableAfterPerformingOperations {

  public static void main(String[] args) {
    FinalValueOfVariableAfterPerformingOperations performingOperations = new FinalValueOfVariableAfterPerformingOperations();
    System.out
      .println(performingOperations.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
  }

  public int finalValueAfterOperations(String[] operations) {
    int x = 0;
    for (int i = 0; i < operations.length; i++) {
      switch (operations[i]) {
        case "--X" :
        case "X--" : x--; break;
        case "X++" :
        case "++X" : x++; break;
      }
    }
    return x;
  }
}
