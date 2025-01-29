package Function

object partiallyCurrying extends App{

//  partially applied function
  def add(a:Int , b:Int , c:Int ) :Int= a+b+c
  val addTwo = add(5,_:Int,_:Int)
  println(addTwo(10,20))
  println(add(1,2,3))
//  Currying functions
  def addN (a:Int)(b:Int) : Int = a+b
  val addWith2 = addN(2) _
  println(addWith2(5))
  println(addN(1)(2))



}
