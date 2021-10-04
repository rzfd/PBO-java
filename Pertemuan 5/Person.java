//Abstract Class
//Code From filename : Person.java
abstract class Person{
  public String fname = "Tarjo";
  public int age = 23;
  public abstract void study();
}

// Subclass (Inherit from Person)
class Student extends Person { 
  public int graduyear = 2019;
  public void study() {// The body of the abstract method is provided here
      System.out.println("Studying all day long");
  }
}

class MyClass {
  public static void main(String[] args) {
    // Create an object of the student class (Which inherit Attributes and methods from person)
    Student OBJ1 = new Student();
    System.out.println("Name : " + OBJ1.fname);
    System.out.println("Age : " + OBJ1.age);
    System.out.println("Graduation Year" + OBJ1.graduyear); 
    OBJ1.study(); // Call Abstract Method 
  }
}

