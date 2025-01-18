// abstract class
abstract class Abstract {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method 
}
// Subclass (inherit from Main)
class Student extends Abstract {
  public int graduationYear = 2022;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}