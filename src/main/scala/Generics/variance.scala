object variance extends App {
  class Animal

  class Dog extends Animal

  class Cat extends Animal

  // Covariant: List[Dog] is also a List[Animal]
  class Box[+T]

  // Contravariant: Trainer[Animal] can also be Trainer[Dog]
  class Trainer[-T]

  // Invariant: Box[T] cannot change type
  class StrictBox[T]

  val dogBox: Box[Dog] = new Box[Dog]
  val animalBox: Box[Animal] = dogBox

  val animalTrainer: Trainer[Animal] = new Trainer[Animal]
  val dogTrainer: Trainer[Dog] = animalTrainer

  val strictDogBox: StrictBox[Dog] = new StrictBox[Dog]
  // val strictAnimalBox: StrictBox[Animal] = strictDogBox  // ERROR (Invariant)

}

