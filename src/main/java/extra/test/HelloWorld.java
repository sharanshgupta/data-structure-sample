package extra.test;

public class HelloWorld {



  public static void main(String[] args) {
    HelloWorld HelloWorldObject = new HelloWorld();
    int output = HelloWorldObject.add(5, 10);
    String name = "Vaishnavi";
    System.out.println(name);
    int get = HelloWorldObject.sub(20, 15);
    System.out.println(get);
    HelloWorldObject.printName("test");
  }

  public int add(int number1, int number2) {
    int answer = number1 + number2;
    return answer;
  }

  public int sub(int number3, int number4) {
    int result = number3 - number4;
    return result;
  }

  public void printName(String name) {
    System.out.println("hello " +  name);


  }
}
