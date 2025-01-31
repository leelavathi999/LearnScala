


class CustomExceptionClass(msg: String) extends Exception(msg)

object CustomException extends App {
  def checkAge(age: Int): Unit = {
    if (age < 18) throw new CustomExceptionClass("Age must be 18 or above!")
    else println("Access granted.")
  }

  try {
    checkAge(16)
  } catch {
    case e: CustomExceptionClass => println(e.getMessage)
  }
}
