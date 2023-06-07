package advanced.implicits

class Person(name: String, age: Int) {
  def snore(): Unit = {
    println(s"${name} is snoring a lot >:(" )
  }
}

object implicitsString {
  implicit class StringEnhanced(name: String) {
    def toPerson(age: Int): Person = {
      new Person(name, age)
    }
    def concatWords(words: String*): String = {
      words.foldLeft(name)((acc: String, word: String) => acc.concat(word))
    }

    def concatList(words: List[String], separator: String): String = {
      val listJoined = words.mkString(separator)
      name.concat(separator).concat(listJoined)
    }

  }
}

object ImplicitConversions extends App {
  import implicitsString.StringEnhanced
  val name = "NAME"
  name.toPerson(30).snore()
}


