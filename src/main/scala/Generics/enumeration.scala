object enumeration extends App{
  enum Day {
    case Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
  }
  val today: Day = Day.Monday
  println(today)
//enum with parameters
  enum Color(val hex: String) {
    case Red extends Color("#FF0000")
    case Green extends Color("#00FF00")
    case Blue extends Color("#0000FF")
  }
  println(Color.Red.hex)

//  enum with methods
enum TrafficLight(val action: String) {
  case Red extends TrafficLight("Stop")
  case Yellow extends TrafficLight("Slow down")
  case Green extends TrafficLight("Go")

  def showAction(): Unit = println(s"$this means $action")
}
  TrafficLight.Red.showAction()


}