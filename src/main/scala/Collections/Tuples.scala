package Collections

object Tuples extends  App{
  val t = (4, 3, 2, 1)
  val sum = t._1 + t._2 + t._3 + t._4

  println("Sum of elements: " + sum)

  t.productIterator.foreach{ i =>println("Value = " + i )}

  println("Concatenated String: " + t.toString() )
  val t2 = new Tuple2(1, 2)
  println("Swapped Tuple: " + t2.swap)
}
