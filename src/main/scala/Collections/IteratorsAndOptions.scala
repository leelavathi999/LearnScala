package Collections

object IteratorsAndOptions extends App{
  val numbers = Iterator(10, 20, 30, 40, 50)

  while (numbers.hasNext) {
    println(numbers.next())
  }
//  println(numbers.min)
//  println(numbers.max)

  def findStudent(id: Int): Option[String] = {
    val students = Map(1 -> "Alice", 2 -> "Bob", 3 -> "Charlie")
    students.get(id) // Returns Some(name) if found, otherwise None
  }

  val student1 = findStudent(2)
  val student2 = findStudent(5)

  println(student1) // Output: Some(Bob)
  println(student2) // Output: None

  val result = findStudent(5).getOrElse("Unknown Student")
  println(result) // Output: Unknown Student

}
