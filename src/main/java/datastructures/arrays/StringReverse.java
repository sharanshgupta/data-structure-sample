package datastructures.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReverse {

  public static void main(String[] args) {
    String inputString = "sharansh";
    String anotherWayToReverseString = ""; // Another way

    String[] inArr = inputString.split("");

    String[] temp = new String[inArr.length];

    for(int i = inArr.length - 1; i >= 0; i--) {
      int tempIndex = (inArr.length - 1) - i;
      temp[tempIndex] = inArr[i];
      anotherWayToReverseString = anotherWayToReverseString + inArr[i]; // Another way
    }

    String reversedString = Arrays.stream(temp).collect(Collectors.joining());

    System.out.println(Arrays.toString(temp));
    System.out.println(reversedString);
    System.out.println(anotherWayToReverseString);
  }

}
