package basic.syntacticsugar

object Apply extends App {
  class Person(val name: String, favoriteMovie: String) {
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  //Apply notation
  val juan = new Person("Juan", "Harry Potter")
  println(juan.apply())
  println(juan()) // equivalent

  /*
  Compiler does not complain because whenever it sees an object called like a function,
  it actually looks for a definition of apply in that class
   */

}
