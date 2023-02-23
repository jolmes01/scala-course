package advanced.functions

object AnonymousFunctions extends App {

  (a: String) => {
    println(s"The value passed is: $a")
  }

  //We have no way to call and execute previous code

  val anonymousValueFunction = (a: String) => {
    println(s"The value passed is: $a")
  }

  anonymousValueFunction("Romina")
}
