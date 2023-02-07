<<<<<<< HEAD
package basic.exercises
=======
package basic.oop
>>>>>>> 6f274629cc0c052fe6c6762d8bd9b156cfb64e14

object TraitsVsAbstract extends App {

  abstract class Animal {
    val creatureType: String = "Wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat: Unit = println("crunch crunch")
  }

  //traits
  trait Carnivore(name: String) {
    def eat(animal: Animal): Unit
    def preferredMeat: String = "fresh meat"
  }
  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "Crocodile"
    def eat: Unit = println("nomnom")
    def eat(animal: Animal): Unit = println(s"I'm ${this.creatureType} and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

}
