object MethodNotation extends App {
  class Person {
    def greet(name: String): String = s"Hello, $name!"
  }

  class Calculator(a: Int) {
    def +(b: Int): Int = a + b
    // Method named '+'
  }

  class Multiplier(factor: Int) {
    def apply(x: Int): Int = x * factor
  }

  class Number(val x: Int) {
    def unary_- : Int = -x // Defines behavior for '-obj'
  }

  val p = new Person()
//  dot notation
  println(p.greet("leela"))
//  infix notation
  println(p greet "leela")
//  Operator Notation
  val calc = new Calculator(10)
  println(calc + 5)
//Apply Notation
  val timesTwo = new Multiplier(2)
  println(timesTwo(5))
//Unary Notation (+obj, -obj, ~obj, !obj)
  val num = new Number(5)
  println(-num)
}




