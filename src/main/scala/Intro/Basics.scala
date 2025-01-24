package Intro
import scala.util.control.Breaks._
object Basics {
def main(args:Array[String]): Unit = {
  // Print a simple message
  println("Hello, World!")
  // Variables and Data Types
  val lang = "Scala" // Immutable variable
  var num = 5 // Mutable variable

  println(lang.length)
//  concatenation
  println(lang.concat(num.toString))
  println(lang+" "+"programming")

//  interpolation
  val name = "John"
  val age = 30

  // Using the s-interpolator
  var message = s"My name is $name and I am $age years old."

  println(message)
  val pi = 3.14159
  val radius = 5

  // Using f-interpolator with formatting
  val area = math.Pi * radius * radius
  message = f"The area of a circle with radius $radius is $area%.2f."

  println(message)
  val text = "C:\\Users\\Dande Leelavathi\\Pictures\\Saved Pictures"
  // Using raw-interpolator to avoid escape sequences
  message = raw"Here is the raw string: $text"

  println(message)
}
}



