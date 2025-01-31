package Exceptions

object MultipleExceptions extends App{
  try {
    val arr = Array(10, 20)
    println(arr(5)) // Index out of bounds
  } catch {
    case e: ArithmeticException => println("Math error!")
    case e: ArrayIndexOutOfBoundsException => println("Array index out of range!")
    case e: Exception => println("Some other error occurred.")
  }
}
