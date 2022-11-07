package leetcode.string.easy;

/*Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it into some number of substrings such that:
Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

Example 1:
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.*/

import java.util.ArrayList;
import java.util.List;

public class SplitAStringInBalancedStrings {

    public static void main(String[] args) {
        String bs = "RLRRLLRLRL";
        SplitAStringInBalancedStrings splitString = new SplitAStringInBalancedStrings();
        int result = splitString.solution(bs);
        System.out.println("Result -> " + result);
    }

    private int solution(String bs) {
        int rCount = 0;
        int lCount = 0;
        int subStringCount = 0;
        for (int i = 0; i < bs.length(); i++) {
            if (bs.charAt(i) == 'R') {
                rCount++;
            } else {
                lCount++;
            }
            if (rCount == lCount) {
                subStringCount++;
            }
        }
        return subStringCount;
    }
}
