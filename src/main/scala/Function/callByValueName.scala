package Function

object callByValueName extends App{

    def callByVal(x: Long): Unit = {
      println("by value: " + x)
      println("by value: " + x)
    }

    def callByName(x: => Long): Unit = {
      println("by name: " + x)
      println("by name: " + x)
    }

    callByVal(System.nanoTime()) // Passed by value
    callByName(System.nanoTime()) // Passed by name
  }


