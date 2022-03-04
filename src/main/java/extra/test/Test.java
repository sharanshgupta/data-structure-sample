package extra.test;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Test {

  public static void swap(Integer i, Integer j)
  {
    Integer temp = new Integer(i);
    i = j;
    j = temp;
  }
  public static void main(String[] args)
  {
    Integer i = new Integer(10);
    Integer j = new Integer(20);
    swap(i, j);
    System.out.println("i = " + i + ", j = " + j);

    ZonedDateTime time;
    time = ZonedDateTime.parse("2022-01-13T06:54:20.508Z");
    System.out.println(time);

    
  }
}
