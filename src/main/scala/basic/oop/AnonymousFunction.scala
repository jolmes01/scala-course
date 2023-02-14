package basic.oop

object AnonymousFunction extends App {

  val anonymousFunction = (x: Int) => x + 1

  val equivAnonymousFunction = new Function1[Int, Int] {
    def apply(x: Int): Int = x + 1
  }

  println(anonymousFunction(10))

  println(equivAnonymousFunction(10))
}
