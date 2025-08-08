//Create a class Student with private variables name and rollNo. Write setter and getter methods to input and display student data.
class fan {
  private String brand;
  private int id;

  public void setBrand(String b) {
    this.brand = b;
  }

  public void setId(int i) {
    this.id = i;
  }

  public String getBrand() {
    return brand;
  }

  public int getId() {
    return id;
  }
}

public class tt {
  public static void main(String[] args) {
    fan f = new fan();
    f.setBrand("Havells");
    f.setId(56);
    
    System.out.println("Fan brand name is: " + f.getBrand());
    System.out.println("Fan ID is: " + f.getId());
  }
}
