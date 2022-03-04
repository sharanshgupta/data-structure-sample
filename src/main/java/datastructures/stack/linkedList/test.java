package datastructures.stack.linkedList;

import java.util.ArrayList;
import java.util.List;

public class test {

  int a;
  int b;
  List<Pojo> pojo;

  public List<Pojo> getPojo() {
    return pojo;
  }

  public void setPojo(List<Pojo> pojo) {
    this.pojo = pojo;
  }

  public static void main(String[] args) {
    Pojo pojo1 = new Pojo();
    pojo1.setA("hello");
    Pojo pojo2 = new Pojo();
    Pojo pojo3 = new Pojo();
    pojo3.setA("hello3");
    ArrayList<Pojo> pojoArrayList = new ArrayList<>();
    pojoArrayList.add(pojo1);
    pojoArrayList.add(pojo2);
    pojoArrayList.add(pojo3);
    test test = new test();
    test.setPojo(pojoArrayList);

    ArrayList<String> list = new ArrayList<>();
    int c = 0;

    while(c < test.getPojo().size()) {
      System.out.println("Yeah");
      list.add(test.getPojo().get(c).getA());
      c++;
    }

    System.out.println("Final");

    System.out.println(list.toString());
  }

}

class Pojo {
  private String a;
  private String b;

  public String getA() {
    return a;
  }

  public void setA(String a) {
    this.a = a;
  }

  public String getB() {
    return b;
  }

  public void setB(String b) {
    this.b = b;
  }
}
