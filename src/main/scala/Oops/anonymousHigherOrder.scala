package Oops

object anonymousHigherOrder extends App{
  var inc =(x:Int) => x+1
  println(inc(7))
  var mul = (a:Int,b:Int) => a+b
  println(mul(10,20))
  var useDir = () => {System.getProperty("user.dir")}
  println(useDir())

//  higher order functions
//  function as parameter
  def operate(x:Int,y:Int,f:(Int,Int) => Int):Int = {
    f(x,y)
  }
  var add = (a:Int,b:Int) => a+b
  println(operate(10,20,add))

//  function as return value
  def getmultiplier(factor:Int) : Int => Int = {
    (x:Int) => x*factor
  }
  var double = getmultiplier(2)
  println(double(4))
}
