class Shape {
  def area(): Double = 0.0
}

class Circle(radius: Double) extends Shape {
  override def area(): Double = math.Pi * radius * radius
}

class Rectangle(length: Double, width: Double) extends Shape {
  override def area(): Double = length * width
}

object Main7 {
  def main(args: Array[String]): Unit = {
    val circle = new Circle(2.0)
    val rectangle = new Rectangle(3.0, 4.0)
    println(s"Area of circle: ${circle.area()}")
    println(s"Area of rectangle: ${rectangle.area()}")
  }
}
