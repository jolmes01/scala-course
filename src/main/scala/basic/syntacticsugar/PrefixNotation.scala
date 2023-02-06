package basic.syntacticsugar

object PrefixNotation extends App {
  class Person(val name: String, favoriteMovie: String) {
    // BE CAREFUL here and put in a space between the name of the method and the return type
    def unary_! : String = s"$name is not a person!!!"
  }

  // Prefix notation - It is ALL about unary operators
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-

  // unary_ only works with - + ~ !

  val juan = new Person("Juan", "Harry Potter")
  println(!juan)
  println(juan.unary_!) // equivalent

}
