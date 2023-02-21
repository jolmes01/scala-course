package basic.oop

object AnonymousFunction extends App {

  val anonymousFunction = (x: Int) => x + 1

  val equivAnonymousFunction = new Function1[Int, Int] {
    def apply(x: Int): Int = x + 1
  }

  println(anonymousFunction(10))

  println(equivAnonymousFunction(10))

  // Exercise
  /*
      Create a two anonymous functions that calculates the below
          1 - Add two numbers and if the result mod 4 is zero then print the result of multiplying both
          2 - Create a function that evaluates if a number mod 2 is zero then print true otherwise print false
   */
}
