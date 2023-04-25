package basic.exercises

object AnonymousFunctionSolution extends App {

  /*
      Create a two anonymous functions that calculates the below
          1 - Add two numbers and if the result mod 4 is zero then print the result of multiplying both
          2 - Create a function that evaluates if a number mod 2 is zero then print true otherwise print false
   */

  val addNumbersMod4 = (x: Int, y: Int) => {
    val result = x + y
    if(result % 4 == 0) println(x * y)
    else result
  }

  val modTwo = (number: Int) => {
    if(number % 2 == 0) println(true)
    else println(false)
  }



}
