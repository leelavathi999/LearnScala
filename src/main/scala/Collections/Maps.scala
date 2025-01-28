package Collections
import scala.collection.mutable.Map
object Maps extends App{
  val amap :Map[Char,Int]=Map(
    'A'->1, 'B'->2
  )

//  amap += ('C'->3)
  println(amap)
  println(amap.keys)
  println(amap.values)

  amap.keys.foreach(i=>
    print("key " + i)
    println(" value " + amap(i))
  )
}