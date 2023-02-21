package basic.syntacticsugar

import scala.language.postfixOps

object SyntacticSugarExercise extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def  hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def  +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    // BE CAREFUL here and put in a space between the name of the method and the return type
    def unary_! : String = s"$name is not a person!!!"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  // Infix notation
  val juan = new Person("Juan", "Harry Potter")
  println(juan.likes("Harry Potter"))
  println(juan likes "Harry Potter") // equivalent

  val ana = new Person("Tom", "Wall-E")
  println(juan hangOutWith ana) // What if we rename the method hangOutWith?

  println(juan + ana)
  println(juan.+(ana)) // equivalent

  // Prefix notation - It is ALL about unary operators
  println(!juan)
  println(juan.unary_!) // equivalent

  //Postfix notation - Functions that do not receive any parameters have the property that they can be used in a postfix notation
  println(juan.isAlive)
  println(juan isAlive) // We need to import scala.language.postfixOps to be able to use the postfix notation

  //Apply notation
  println(juan.apply())
  println(juan()) // equivalent

  /*
  Compiler does not complain because whenever it sees an object called like a function,
  it actually looks for a definition of apply in that class
   */

  /*
  1.  Overload the + operator to receive a nickname and return a new Person with its nickname concatenated
  juan + "the rockstar" => new Person "Juan (the rockstar)"

  2.  Add an age to the Person class
      Add a unary + operator that will return a new person with the age incremented
  +juan => juan with the age incremented

  3.  Add a "learns" method in the Person class that receives an String and it returns "$name learns [String]". Note: Use infix notation
      Add a learnsScala method that does not receives parameters but it calls learns method with "Scala" as parameter
  Use it in postfix notation

  4.  Overload the apply method to receive a number
  juan.apply(2) => "Juan runs 2 times a day"
   */

}
