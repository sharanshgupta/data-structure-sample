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

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters1 {

  public static void main(String[] args) {
    LongestSubstringWithoutRepeatingCharacters1 longestSubStr = new LongestSubstringWithoutRepeatingCharacters1();
    System.out.println(longestSubStr.lengthOfLongestSubstring("pwwkew"));
  }

  public int lengthOfLongestSubstring(String s) {
    HashSet<Character> hash = new HashSet();
    int i = 0;
    int j = 0;
    int max = 0;

    while(i<s.length())
    {
      if(!hash.contains(s.charAt(i)))
      {
        hash.add(s.charAt(i));
        max = Math.max(max,hash.size());
        i++;
      }
      else
      {
        hash.remove(s.charAt(j));
        j++;
      }
    }
    return max;
  }
}
