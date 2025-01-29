package Oops

class ClassDog (name:String, breed:String){
  println("It is:" + name + " Breed is:" + breed)
}

object Main {
  def main(args:Array[String]) :Unit ={
    var dog1 = new ClassDog("tuffy", "papillon")
    
  }
}
