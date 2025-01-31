object ExceptionExample extends App {

  try {
    val data = 10 / 0
  } catch {
    case e: ArithmeticException => println("Error : Division by zero ")
  }finally{
    println("Final Block executed always")
  }
}