//Create a class Student with name and roll number using a parameterized constructor. Print the details.
import java.util.*;
import bank.*;;
class Student {
  String name;
  int rollno;
  Student (String n,int a) {
    name = n;
    rollno =  a;
  }
  void show() {
    System.out.println("student namme: "+name);
    System.out.println("Student rolno: "+rollno);
  }
}
public class jjj {
  public static void main(String[] args) {
    Bank.Account account = new Bank.Account();
    account.name = "customer";
    
    

  }
  
}
