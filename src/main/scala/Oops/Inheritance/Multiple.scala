package Oops.Inheritance
// multiple inheritance using traits
// Trait 1
trait C1 {
  def method1(): Unit
}
// Trait 2
trait C2 {
  def method2(): Unit
}
// Class that implement both C1 and c2 traits
class Derived extends C1 with C2 {
  // method1 from C1
  def method1(): Unit = {
    println("Trait 1");
  }
  // method2 from C2
  def method2(): Unit = {
    println("Trait 2");
  }
}

object Main5 {
  // Driver code
  def main(args: Array[String]): Unit = {
    var obj = new Derived();
    obj.method1();
    obj.method2();
  }
}

