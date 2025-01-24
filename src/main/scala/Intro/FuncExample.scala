package Intro

class FuncExample(xc:Int,yc:Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int):Unit= {
    x = x + dx
    y = y + dy
    println("Point x location : " + x);
    println("Point y location : " + y);
  }
}
object demo {
  def main(args:Array[String]): Unit = {
    val objName=new FuncExample(10,20)
    objName.move(10,10)
  }
}
