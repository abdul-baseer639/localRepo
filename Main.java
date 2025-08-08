
class student {
  private String name;
  public void setName(String n){
    name=n;
  }
  public String getName() {
    return name;


  }
}
public class Main {
  public static void main(String[] args) {
    student s = new student();
    s.setName("baseer");
    System.out.println(s.getName());

  }
}