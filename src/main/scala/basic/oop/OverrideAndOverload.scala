package basic.oop

object OverrideAndOverload extends App {

  class Car(protected val color: String, protected val speed: Double) {
    val model = "None"

    //Overloading
    protected def accelerate(): Unit = println("+10 km/h")
    protected def accelerate(speedIncrement: Double): Unit = println(s"$speedIncrement km/h")
  }

  // Overriding
  class Bmw(override val model: String) extends Car("Blue", 0.0) {
    //override val model = "X5"
    override def accelerate: Unit = println("+20 km/h")
  }

  class Civic(modelValue: String) extends Car("Gray", 0.0) {
    override val model = modelValue
    override def accelerate: Unit = println("+20 km/h")
  }

  val car = new Bmw("X5")
  car.accelerate
  println(car.model)

  //What is Polymorphism?
  var unknownCar: Car = new Bmw("X5")
  unknownCar = new Civic("Civic 2009")

  // Super - it refers to anything in the superclass
  class Toyota(model: String) extends Car("Gray", 0.0) {
    //override val model = model <-- DOING this, the compiler will not know that we refers to the model in superclass
    override val super.model = model
    override def accelerate: Unit = {
      super.accelerate()
      println("+20 km/h")
    }
  }

  // How to prevent overrides
  /*
  1. Use final on member
  2. Use final on the entire class
  3. Use sealed on the entire class = extend classes in THIS FILE, prevent extension in other files
   */


}
