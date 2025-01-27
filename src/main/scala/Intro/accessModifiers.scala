package Intro

class accessModifiers {
//  private
  class Inner {
    private def f(): Unit = {
      println("inner function")
    }
    class InnerMost {
      f()

    }
//  (new Inner).f() // Error: f is not accessible

  }

//protected
class Super {
  protected def f1(): Unit = {
    println("protected function")
  }
  class sub extends  Super{
    f1()
  }

//  class Other {
//    (new Super).f() // Error: f is not accessible
//  }
}
  class Outer2 {
    class Inner2 {
      def f2() : Unit={
        println("public method")
      }

      class InnerMost1 {
        f2() // OK
      }
    }

    (new Inner2).f2() // OK because now f() is public
  }

}


object demo1 {
  def main(args:Array[String]): Unit = {
    val p=new accessModifiers
   // Create an instance of inner
    val innerObject = p.Inner()

    // Create an instance of InnerMost from the inner instance
    val innerMostObject = innerObject.InnerMost()
    val superobject = p.Super()
    val subobject = superobject.sub()

    val outer2obj=p.Outer2()
    val inner2obj=outer2obj.Inner2()
  }
}