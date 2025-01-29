package Oops.Inheritance

// Companion class
class ExampleofCompanion {

  // Variables of Companion class
  var str1 = "This is ";
  var str2 = "Scala Programming";

  // Method of Companion class
  def show(): Unit = {
    println(str1);
    println(str2);
  }
}
// Companion object
object ExampleofCompanion {
  def main(args: Array[String]): Unit = {
    var obj = new ExampleofCompanion();
    obj.show();
    SingletonCompanion.sayHello()
  }
}
//singleton class
object SingletonCompanion{
  def sayHello(): Unit = println("Hello from singleton")
}

