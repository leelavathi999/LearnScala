package Oops.Inheritance

// Base class
class Parent1
{
  var Name: String = "leela"
}
// Derived from parent class
// Base class for Child2 class
class Child1 extends Parent1 {
  var Age: Int = 32
}
// Derived from Child1 class
class Child2 extends Child1 {
  // Method
  def details():Unit={
    println("Name: " +Name);
    println("Age: " +Age);
  }
}

object Main3 {
  def main(args: Array[String]):Unit= {
    // Creating object of the derived class
    val ob = new Child2();
    ob.details();
  }
}
