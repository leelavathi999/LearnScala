package Oops.Inheritance

// Base class
class Parent2 {
  var Name1: String = "Siya"
  var Name2: String = "Soniya"
}
// Derived from the parent class
class Derived1 extends Parent2
{
  var Age: Int = 32
  def details1() :Unit={
    println(" Name: " +Name1)
    println(" Age: " +Age)
  }
}

// Derived from Parent class
class Derived2 extends Parent2 {
  var Height: Int = 164
  // Method
  def details2() :Unit={
    println(" Name: " +Name2)
    println(" Height: " +Height)
  }
}

object Main4 {
  def main(args: Array[String]):Unit= {
    // Creating objects of both derived classes
    val ob1 = new Derived1()
    val ob2 = new Derived2()
    ob1.details1()
    ob2.details2()
  }
}

