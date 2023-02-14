package basic.oop

object AnonymousClass extends App {

  abstract class Animal {
    def eat: Unit
  }

  // anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("nomnomnom")
  }

  /*
    equivalent with

    class AnonymousClass$$anon$1 extends Animal {
      override def eat: Unit = println("nomnomnom")
    }
    val funnyAnimal: Animal = new AnonymousClass$$anon$1
   */

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name")
  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi, my name is Jim")
  }

  // Anonymous classes works for traits and classes (abstract or not)
  /* Rules
        - pass in required constructor arguments if needed
        - implement all abstract fields/methods
   */
}
