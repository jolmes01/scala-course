<<<<<<< HEAD
package basic.exercises
=======
package basic.oop
>>>>>>> 6f274629cc0c052fe6c6762d8bd9b156cfb64e14

object AbstractClass extends App {

  // abstract
  abstract class Car {
    val color: String
    val speed: Double

    def accelerate: Unit
  }

  // Abstract classes CANNOT be instantiated because an instance has to have all implemented
  // val bmw = new Car <-- The compiler will complain, saying that nothing is implemented

  class Bmw extends Car // Notice that before implement the abstract attributes the compiler complain
  {
    val color: String = "Blue"
    val speed: Double = 0.0

    def accelerate: Unit = println("+20 km/h")
  }

}
