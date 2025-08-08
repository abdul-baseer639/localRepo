class Book{
  String name;
  Book() {
    name = "sherlock homes";
    System.out.println("the book ");
  }
  void read(){
    System.out.println("the book name is: "+name);
  }
}
public class jas {
  public static void main(String[] args) {
    Book b = new Book();
    b.read();
  }
}
