package advanced.functions

object FirstClassFunctions extends App {

  def stringReturn(a: String): String = {
    a
  }

  case class Person(attribute1: String, atributte2: Int)

  def caseClassReturn(a: String, b: Int): Person = {
    Person(a,b)
  }

  val valueFunction = (a: String, b: Int) => {
    Person(a,b)
  }


  println(stringReturn("Bruce"))

  println(caseClassReturn("Otto", 30))

  println((() => {"Petter"}).apply())

  println(valueFunction(stringReturn("Norman"), 29))

}
