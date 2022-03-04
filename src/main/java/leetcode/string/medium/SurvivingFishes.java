package leetcode.string.medium;

public class SurvivingFishes {

  public static void main(String[] args) {
    SurvivingFishes findFish = new SurvivingFishes();
    System.out.println(findFish.solution("ABAD"));
  }

  public int solution(String S) {
    int l = S.length();

    while(S.length() > 1) {
      S = eatFish(S);
      if(S.length() == l)
        break;
      else l = S.length();
    }

    return S.length();
  }

  private String eatFish(String S) {
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == 'A') {
        if (S.charAt(i+1) == 'B' || S.charAt(i+1) == 'C')
          S = S.substring(0, i+1).concat(S.substring(i+2, S.length()));
      } else if (S.charAt(i) == 'B') {
        if (S.charAt(i+1) == 'C' || S.charAt(i+1) == 'D')
          S = S.substring(0, i+1).concat(S.substring(i+2, S.length()));
      } else if (S.charAt(i) == 'C') {
        if (S.charAt(i+1) == 'D')
          S = S.substring(0, i+1).concat(S.substring(i+2, S.length()));
      }
    }
    return S;
  }

}
