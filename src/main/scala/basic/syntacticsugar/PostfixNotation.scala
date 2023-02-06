package basic.syntacticsugar

import scala.language.postfixOps

object PostfixNotation {
  class Person(val name: String, favoriteMovie: String) {
    def isAlive: Boolean = true
  }

  //Postfix notation - Functions that do not receive any parameters have the property that they can be used in a postfix notation
  val juan = new Person("Juan", "Harry Potter")
  println(juan.isAlive)
  println(juan isAlive) // We need to import scala.language.postfixOps to be able to use the postfix notation

}
