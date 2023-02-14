package basic.oop

object Generics extends App {

  class MyList[A] {
    // use the type A
  }

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  // Notice how MyList[A] gets reusable for every single possible type

  // Expand MyList to be generic 
}
