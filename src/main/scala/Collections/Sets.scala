package Collections

object Sets extends App{
//  creation
  var s : Set[Int]=Set(1,2,3,4,5)
  println(s)
  val newSet = s + 6  // Adds 6 to the set

  println(newSet)  // Output: Set(1, 2, 3, 4, 5, 6)
  println(s)       // Output: Set(1, 2, 3, 4, 5) (original set remains unchanged)

  var t=Set(10,20,30,40,50)
//  concatenating
  println(s ++ t)
  println(s & t)
//  println(t+100)
  println(t.size)
}
