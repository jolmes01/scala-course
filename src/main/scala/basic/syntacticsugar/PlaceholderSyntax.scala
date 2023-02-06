package basic.syntacticsugar

object PlaceholderSyntax extends App {

  val listOfNumbers = List(1,2,3,4,5,6,7,8,9)
  // Without placeholder syntax
  listOfNumbers.foreach(item => println(item))

  // With placeholder syntax
  listOfNumbers.foreach(println(_))

  val double = 2 * (_: Int)
  val sum = (_: Int) + (_: Int)

}
