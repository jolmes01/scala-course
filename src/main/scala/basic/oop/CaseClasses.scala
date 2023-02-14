package basic.oop

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  // 1. Class parameters are fields
  val juan = new Person("Juan", 30)
  println(juan.name)

  // 2. sensible toString,
  // println(instance) = println(instance.toString)
  println(juan.toString) // Remove the case keyword and see what happens with the toString method

  // 3. equals and hashCode implemented OOTB
  val juan2 = new Person("Juan", 30)
  println(juan == juan2)  // Remove the case keyword and see what the result is

  // 4. CCs have handy copy method
  val juan3 = juan.copy() // or .copy(age = 35) which returns the same instance except by the age
  println(juan3)

  // 5. CCs have companion objects
  val thePerson = Person
  val ana = Person("Ana", 23)

  // 6. CCs are serializable, which makes classes especially useful when dealing with distributed systems

  // 7. CCs have extractor patterns == CCs can be used in PATTERN MATCHING

  // 8. CCs are also applicable to object keyword
  case object Dog {
    def name: String = "Baxter"
  }


  /*
  Expand MyList to use case classes and case objects
   */



}
