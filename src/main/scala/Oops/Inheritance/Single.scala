package Oops.Inheritance

// Base class
class Parent {

  var Name: String = "Leela"
}
  // Derived class
  // Using extends keyword
  class Child extends Parent {
    var Age: Int = 22

    // Method
    def details() :Unit = {
      println("Name: " + Name);
      println("Age: " + Age);
    }
  }

  object Main2 {
    def main(args: Array[String]) :Unit={
      // Creating object of the derived class
      val ob = new Child()
      ob.details()
    }
  }


