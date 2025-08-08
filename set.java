class Person {
  private String name;
  private int age;
  public void setName(String n) {
    name = n;
  }
  public void setAge(int i) {
     age = i;
  }
public String getName() {
  return name;
}
public int getAge() {
  return age;
}
  
}
public class set {
  public static void main(String[] args) {
    Person p = new Person();
    p.setName("Baseer");
    p.setAge(18);
    System.out.println(p.getName());
    System.out.println(p.getAge());
  }
  
}
