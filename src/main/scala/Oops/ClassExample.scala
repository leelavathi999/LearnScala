package Oops

class ClassExample {
  // Class variables
  var number: Int = 16
  var nameofcompany: String = "Apple"

  // Class method
  def Display() :Unit = {
    println("Name of the company : " + nameofcompany)
    println("Total number of Smartphone generation: " + number)
  }

}
object Main1 {
  def main(args:Array[String]): Unit = {
    var obj = new ClassExample()
    obj.Display()

  }
}
