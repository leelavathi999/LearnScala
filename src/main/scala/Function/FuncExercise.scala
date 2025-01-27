package Function

object FuncExercise extends App {
  def greeting(name: String, age: Int): String = 
//    println(s"hi, my name is $name and I am $age years old")
    "Hi,My Name is " + name + "and I'm "+age +" years old"
  println(greeting("Leela",22))

//  factorial
  def factorial(n:Int):Int=
    if (n<=0) 1
    else n*factorial(n-1)
  println(factorial(5))

//  fibanocci
  def fibonacci(n:Int):Int=
    if (n<=2) 1
    else fibonacci(n-1)+fibonacci(n-2)
  println(fibonacci(3))

//  prime
  def isPrime(n:Int):Boolean={
    def isPrimeUntil(t:Int):Boolean=
      if (t<=1) true
      else n % t !=   0 && isPrimeUntil(t-1)
    isPrimeUntil(n/2)
  }
  println(isPrime(4))

}
