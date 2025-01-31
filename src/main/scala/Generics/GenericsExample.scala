
object GenericsExample extends App{
  class Container[T](value: T) { // 'T' is a type parameter
    def getValue: T = value
  }

  val intContainer = new Container(10) // Works with Int
  val strContainer = new Container("Hello") // Works with String

  println(intContainer.getValue) // Output: 10
  println(strContainer.getValue) // Output: Hello

  // Generic methodx
  object GenericMethod {
    def swap[A, B](pair: (A, B)): (B, A) = (pair._2, pair._1)
  }

  val swappedPair = GenericMethod.swap(1, "Scala")
  println(swappedPair)
}



