package Collections

object Lists extends App{

  val languages : List[String] = List("python","java","scala","javascript")
  println(languages)
//  accessing the elementS
  println(languages(2))
  // List of Strings
  val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
  println(fruit)
//  empty list
  var xlist:List[Nothing]=List()
  var empty =   Nil
  println(empty)
  println(xlist)
//  Two dimensional list
  val dim: List[List[Int]] =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )
   println(dim)
//   concatenating
  println(fruit ::: languages)
  println(fruit.:::(languages))
  println(fruit.concat(languages))

//  tabulate
  val squares = List.tabulate(5)(i=>i*i)
  println(squares)
  println(squares.reverse)

//  methods
val fruits = List("apple", "banana", "cherry")
  println(fruits.head) // Output: apple
  println(fruits.tail)
  println(fruits.isEmpty)

}
