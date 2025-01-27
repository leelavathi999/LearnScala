package Function

object Recursion extends  App{
  def factorial(n:Int):BigInt= {
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n, 1)
  }
  println(factorial(10))

//  concatenate a string n times
  def concatString(aString:String,n:Int,accumulator:String):String={
    if (n<=0) accumulator
    else concatString(aString,n-1,aString+accumulator)
  }
  println(concatString("leela ",3,""))

//  prime
  def isPrime(n:Int):Boolean={
    def isPrimeTailrec(t:Int,isStillPrime:Boolean):Boolean= {
      if (!isStillPrime) false
      else if (t<=1) true
      else isPrimeTailrec(t-1,n%t != 0 && isStillPrime)
    }
    isPrimeTailrec(n/2,true)
  }
  println(isPrime(5))

//  fibonacci
  def fibonacci(n:Int):Int={
    def fibonacciTailrec(i:Int , last :Int , nextToLast:Int):Int=
      if (i >= n) last
      else fibonacciTailrec(i+1,last+nextToLast,last)
    if (n<=2) 1
    else fibonacciTailrec(2,1,1)
  }
  println(fibonacci(4))
}
