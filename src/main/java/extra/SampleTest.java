package extra;

public class SampleTest {

  public static void main(String[] args) {
    SampleTest test = new SampleTest();

    test.solution();
  }

  private void solution() {

    /*
    * Array element print number of stars at indexed column
    Input : 1, 4, 3, 6, 2
            *  *  *  *  *
               *  *  *  *
               *  *  *
               *     *
                     *
		     **/

    Integer[] arr = new Integer[] {1,4,3,6,2};

    int maxNum = 0;

    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > maxNum) {
        maxNum = arr[i];
      }
    }

    while (maxNum > 0) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] > 0) {
          System.out.print("*");
          arr[j]--;
        } else {
          System.out.print(" ");
        }
      }
      maxNum--;
      System.out.println("");
    }
  }
}
