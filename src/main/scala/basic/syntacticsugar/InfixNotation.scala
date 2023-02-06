package basic.syntacticsugar

object InfixNotation extends App {
  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def  hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def  +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
  }

  // Infix notation
  val juan = new Person("Juan", "Harry Potter")
  println(juan.likes("Harry Potter"))
  println(juan likes "Harry Potter") // equivalent

  /*
  Infix = operator notation. It only works with methods that receives ONLY one parameter
   */

  /*
  Scala gives you such freedom to name your methods as you want, meanwhile in other languages the characters like:
  + - $ and & are actually reserved. So let's create the method hangOutWith
   */
  val ana = new Person("Tom", "Wall-E")
  println(juan hangOutWith ana) // What if we rename the method hangOutWith?

  println(juan + ana)
  println(juan.+(ana)) // equivalent

  // Actually mathematical operators are methods as well
  println(1 + 2)
  println(1.+(2))


}
