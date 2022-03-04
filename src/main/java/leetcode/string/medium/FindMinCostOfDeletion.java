package leetcode.string.medium;

public class FindMinCostOfDeletion {

  public static void main(String[] args) {

    String s = "aabbcc";
    int[] cost = {1,2,1,2,1,2};
    FindMinCostOfDeletion findCost = new FindMinCostOfDeletion();
    System.out.println(findCost.solution(s, cost));
  }

  public int solution(String S, int[] C) {

    int cost = 0;

    for (int i = 0; i < S.length() - 1; i++) {
      if(S.charAt(i) == S.charAt(i+1))
      {
        cost = cost + Math.min(C[i], C[i+1]);
        if(C[i] >= C[i+1])
          C[i+1] = C[i];
      }
    }
    return cost;
  }
}
