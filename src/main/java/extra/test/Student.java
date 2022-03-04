package extra.test;

public class Student {

  public String name;
  public int id;
  public int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public static void main(String[] args) {
    Student sharansh = new Student();
    Student vaishnavi = new Student();

    vaishnavi.setName("Vaishnavi");
    vaishnavi.setId(2);
    vaishnavi.setAge(28);

    sharansh.setName("sharansh");
    sharansh.setId(1);
    sharansh.setAge(20);

    System.out.println("My name is " + sharansh.getName());
    System.out.println(sharansh.getId());
    System.out.println(sharansh.getAge());

    sharansh.printObject(vaishnavi);

  }

  public void printObject(Student studentObject) {
    System.out.println("My name is " + studentObject.getName());
    System.out.println(studentObject.getId());
    System.out.println(studentObject.getAge());

  }

}
