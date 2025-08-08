class Pen {
  String color;
  String type;
  public void write() {
    System.out.println("writing something");

  }
}
public class oop {
  public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.color = "blue";
    p1.type = "gel";
    p1.write();
  }
}