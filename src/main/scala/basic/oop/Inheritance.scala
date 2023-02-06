package basic.oop

object Inheritance extends App {

  /*
  // Non-Private
  class Animal {
    def eat = println("nom nom")
  }
  class Cat extends Animal

  val cat = new Cat
  cat.eat
   */
  /*
  // Private
  class Animal {
    private def eat = println("nom nom")
  }
  class Cat extends Animal

  val cat = new Cat
  cat.eat // <-- eat is inaccesible
   */
  /*
  // Protected
  class Animal {
    protected def eat = println("nom nom") // Using protected marks this method only usable within the class and subclasses ONLY
  }
  class Cat extends Animal {
    def crunch = {
      eat // <- We can access to the protected method here but outside of the subclass, we will have to access to the crunch method
      println("crunch crunch")
    }
  }

  val cat = new Cat
  //cat.eat // <-- eat is inaccesible
  cat.crunch
   */

  // Inheritance with Constructors
  /*
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person // compiler complains that we have unspecified parameters
   */

  // To solve the above while extending from a superclass we need to either pass parameters or define constructors within the superclass
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)
  class Adult2(name: String, age: Int, idCard: String) extends Person(name)

}
