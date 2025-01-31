class Calculator {
  // Method with two parameters
  def add(a: Int, b: Int): Int = {
    a + b
  }

  // Overloaded method with three parameters
  def add(a: Int, b: Int, c: Int): Int = {
    a + b + c
  }

  // Overloaded method with double parameters
  def add(a: Double, b: Double): Double = {
    a + b
  }
}

object overloading extends App {
  val calc = new Calculator()

  println(calc.add(10, 20))       // Calls add(Int, Int)
  println(calc.add(10, 20, 30))   // Calls add(Int, Int, Int)
  println(calc.add(10.5, 20.3))   // Calls add(Double, Double)
}
