package leetcode.string.medium;

/*
  Given a string s, find the length of the longest substring without repeating characters.

  Example 1:
  Input: s = "abcabcbb"
  Output: 3
  Explanation: The answer is "abc", with the length of 3.

  Example 2:
  Input: s = "pwwkew"
  Output: 3
  Explanation: The answer is "wke", with the length of 3.
  Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacters {

  public static void main(String[] args) {
    LongestSubstringWithoutRepeatingCharacters longestSubStr = new LongestSubstringWithoutRepeatingCharacters();
    System.out.println(longestSubStr.lengthOfLongestSubstring("dvdf"));
  }

  public int lengthOfLongestSubstring(String s) {

    String subString = "";
    String finalSubString = "";
    String[] split = s.split("");


    for (int i = 0; i < split.length; i++) {
      if(subString.contains(split[i])) {
        if(subString.length() > finalSubString.length()) {
          finalSubString = subString;
        }
        subString = split[i];
      } else {
        subString = subString.concat(split[i]);
      }
    }
    if(subString.length() > finalSubString.length()) {
      return subString.length();
    }
    return finalSubString.length();
  }
}
