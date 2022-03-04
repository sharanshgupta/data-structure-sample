package datastructures.hashtables;

/*
  Given a String, find first character that is recurring in the string.
  Ex: Input - "elephant" Output - "e"
*/

import java.util.HashSet;

public class FindFirstRecurringCharacter {

  public static void main(String[] args) {
    System.out.println(findFirstRecurringChar("elephant"));
  }

  private static String findFirstRecurringChar(String input) {
    String[] arr = input.split(""); // Creating array of characters of input
    HashSet<String> hashSet = new HashSet<>(); // Empty Hashset where characters will be inserted

    //Loop through input arr and check if character exists in Hashset, if not then push to set.
    for (int i = 0; i < arr.length; i++) {
      boolean contains = hashSet.contains(arr[i]);
      if (contains) {
        return arr[i];
      } else {
        hashSet.add(arr[i]);
      }
    }
    return "No recurring character.";
  }

}
