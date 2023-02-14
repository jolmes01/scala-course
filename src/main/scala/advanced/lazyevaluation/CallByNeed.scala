package advanced.lazyevaluation

object CallByNeed extends App {

  def longComputation: Int = {
    println("Running logic...")
    println("Job successfully completed.")
    1
  }

  def threeTimesByValue(number: Int, complex: Boolean = true): Int = {
    if (complex) number + number + number else 1
  }

  def threeTimesByName(number: => Int, complex: Boolean = true): Int = {
    if (complex) number + number + number else 1
  }

  println("** First by value run **")
  println("Result: " + threeTimesByValue(longComputation))

  println("** Second by value run **")
  println("Result: " + threeTimesByValue(longComputation, complex = false))

  println("** First by name run **")
  println("Result: " + threeTimesByName(longComputation))

  println("** Second by name run **")
  println("Result: " + threeTimesByName(longComputation, complex = false))


  //Call by need functionality

  def threeTimesByNeed(number: => Int, complex: Boolean = true): Int = {
    lazy val byNeed = number
    if (complex) byNeed + byNeed + byNeed else 1
  }

  println("** First by need run **")
  println("Result: " + threeTimesByNeed(longComputation))

  println("** Second by need run **")
  println("Result: " + threeTimesByNeed(longComputation, complex = false))

}
