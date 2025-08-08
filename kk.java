
//Create a class Car with brand, model, and price. Use a parameterized constructor and print the car details.
class Car{
  String brand;
  String model;
  int price;
  Car(String n,String m,int b){
    brand = n;
    model = m;
    price = b;
  }
  Car (Car obj){
    brand = obj.brand;
    model = obj.model;
    price = obj.price;
  }
  void company() {
    System.out.println("car brand name is : "+brand);
    System.out.println("car model: "+model);
    System.out.println("car price: "+price+"k");
  }
  


}
public class kk {
  public static void main(String[] args) {
    Car c = new Car("toyota","legender",75);
    Car c1=new Car(c);
    c1.company();

  }
  
}
