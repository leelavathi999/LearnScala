package Exceptions
import scala.util.{Try,Success,Failure}
object TrySuccessFailure extends App{
//  try block
  val result = Try(10/0)

  result match{
    case Success(value) => println(s"Result $result")
    case Failure(exception) => println(s"Error ${exception.getMessage}")
  }

}
