class Person(name: String, age: Int) {
  // Auxiliary Constructor
  def this(name: String) = {
    this(name, 18) // Default age as 18
    println("Auxiliary constructor called")
  }

  def showDetails(): Unit = {
    println(s"Name: $name, Age: $age")
  }
}
object Main8 extends App {


  // Using primary constructor
  val p1 = new Person("Alice", 22)
  p1.showDetails()

  // Using auxiliary constructor
  val p2 = new Person("leela",age = 12)
  p2.showDetails()
}
