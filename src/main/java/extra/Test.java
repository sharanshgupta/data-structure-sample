package extra;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

  static String c = "hello";

  public static void main(String[] args) {

    for (String elem : args) {
      System.out.println(elem);
    }

    String a = "hello";
//    a = "test";
//    System.out.println(a);
//    String b = "hello";
    String b = new String("hello");

    System.out.println(a==b);
    System.out.println(a.equals(b));


    System.out.println(a.equals(c));
    System.out.println(a == c);

    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("asd", "asda");
    hashMap.put("asd", "asda");
    hashMap.put(null, "asda");
    hashMap.put(null, "rew");

    System.out.println(hashMap.get(null));

    ArrayList<String> arrayList = new ArrayList<>(1);
    arrayList.add(0, "Asda");
    arrayList.add(1, "Aswe");
    arrayList.add(2, "poiu");

    System.out.println(arrayList.get(2));

  }
}
