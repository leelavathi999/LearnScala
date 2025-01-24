package Intro

import scala.util.control.Breaks._
object Loops {
  def main(args: Array[String]): Unit = {
    trace1()
    addition()
    findMax()
    breakStat()
    whileL()
  }

  def trace1(): Unit = {
    var myList1: Array[String] = new Array[String](3);
    myList1(0) = "leela";
    myList1(1) = "andy";
    myList1(2) = "dhanu";
    println(myList1.mkString(", "))
  }

  def addition(): Unit = {
    val nums = Array(1, 2, 3, 4, 5);
    var total = 0;
    for (i <- 0 to (nums.length - 1)) {
      total += nums(i);
    }
    println(total);
  }

  def findMax(): Unit = {
    val nums = Array(1, 2, 3, 4, 5);
    var max = nums(0);
    for (i <- 1 to (nums.length - 1)) {
      if (nums(i) > max) max = nums(i)
    }
    println(max);
  }

  def breakStat(): Unit = {
    var i = 0;
    breakable {
      for (i <- 0 to 10) {
        println(i);
        if (i == 5) {
          println("loop breaks at i = 5");
          break();
        }

      }
    }

  }

  def whileL(): Unit = {
    // Local variable declaration:
    var a = 10;
    while(a<20){
      println(a)
      a=a+2
    }
   /* // do loop execution
    do {
      println("Value of a: " + a);
      a = a + 1;
    }
    while (a < 20)
    */

  }


}


