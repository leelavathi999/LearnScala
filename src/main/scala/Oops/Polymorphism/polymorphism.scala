// many functions with the same name
class example {
  def func(a:Int): Unit = {
    println("First Execution:" + a);
  }
  def func(a:Int, b:Int): Unit = {
    var sum = a + b;
    println("Second Execution:" + sum);
  }
  def func(a:Int, b:Int, c:Int): Unit = {
    var product = a * b * c;
    println("Third Execution:" + product);
  }
}

object Main6
{
  // Main method
  def main(args: Array[String]): Unit = {
    var ob = new example();
    ob.func(120);
    ob.func(50, 70);
    ob.func(10, 5, 6);
  }
}
