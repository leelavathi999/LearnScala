//Parent Class
class Animal {
  def speak():Unit={
    println("Animal makes sound")
  }
}

// Child class overriding the method
class Dog extends Animal {
  override def speak(): Unit = {
    println("Dog barks")
  }
}

object overriding extends App{
  // Polymorphism: Parent reference, child object
  val animalObj :Animal = new Dog()
  animalObj.speak()
  // Calls Dog's speak() method (Runtime Polymorphism)
  val a = new Animal()
  a.speak()
}