package Function

object stringOperations extends App{
  def stringmethods(): Unit = {
    var myString="Hello Scala Programmer"
    println(myString.charAt(2))
    println(myString.substring(0,5))
    println(myString.startsWith("H"))
    println(myString.replace("Hello","Hey"))
    println(myString.toLowerCase)
    println(myString.length)
    println(myString.reverse)
    var x = '2'
    println(x.toInt)
    
  }
  stringmethods()
}
