package extra;

public class Test1 {

  public static void main(String[] args) {

    try{
      System.out.println(" First Wala Line !! ");
      int i = 10/0;
    } catch(RuntimeException e){
      int j = 5/0;
      System.out.println(" First  Line  pe Exception!! ");
    } catch(Exception ex){
      System.out.println(" Catch me bhi  Exception!! ");
    }
  }

  // Output - " First Wala Line !! "
  // " Catch me bhi  Exception!! "
}
