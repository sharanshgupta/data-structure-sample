package leetcode.string.medium;


import java.util.TreeSet;

/*
String s = "50552"
[50,05,55,52]
Answer - 55 as 55 is max in above array
* */
public class FindMaxTwoDigitIntFromString {

  public static void main(String[] args) {

    String s = "023402394";
    FindMaxTwoDigitIntFromString findMax = new FindMaxTwoDigitIntFromString();
    System.out.println(findMax.solution(s));
  }

  public int solution(String S) {

    String[] split = S.split("");
    TreeSet<Integer> sortedInt = new TreeSet<>();
    for (int i = 1; i < S.length(); i++) {
      String i1 = split[i -1] + split[i];
      sortedInt.add(Integer.valueOf(i1));
    }
    return sortedInt.last();
  }
}
