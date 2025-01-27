package Function

object Functions extends App {
  def aFunction(a:String,b:Int):String={
  a +" "+b
  }
  println(aFunction("Hello",2))
  def aParamLessFunc():Int =42
println(aParamLessFunc())
//  println(aParamLessFunc)

def aRepeatFunc(aString:String,n:Int):String={
  if (n==1) aString
  else aString + aRepeatFunc(aString,n-1)
}
println(aRepeatFunc("Hello " ,3))


def aFunc(aString:String):Unit = println(aString)
println(aFunc("Hello"))
}
