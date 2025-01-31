class MyThread extends Thread {
  override def run(): Unit = {
    for (i <- 1 to 5) {
      println(s"Thread ${Thread.currentThread().getName} - Count: $i")
      Thread.sleep(1000) // Pause for 500ms to simulate processing
    }
  }
}

object ThreadExample extends App {
  val t1 = new MyThread()
  val t2 = new MyThread()
//
  t1.start() // Starts first thread
  t2.start() // Starts second thread

//  t1.run()
//  t2.run()
}
