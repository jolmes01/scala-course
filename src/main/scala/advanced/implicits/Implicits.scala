package advanced.implicits

object ExplicitContext {

  def runProcess(data: String, context: String): Unit = {
    println(s"Processing data '${data}' using the context '${context}'")
  }

  def writeData(data: String, path: String, context: String): Unit = {
    println(s"Writing data '${data}' in '${path}' on '${context}'")
  }

  def readData(path: String, context: String): Unit = {
    println(s"Reading data from '${path}' using the context '${context}'")
  }
}

object ImplicitContext {

  def runProcess(data: String)(implicit context: String): Unit = {
    println(s"Processing data '${data}' using the context '${context}'")
  }

  def writeData(data: String, path: String)(implicit context: String): Unit = {
    println(s"Writing data '${data}' in '${path}' on '${context}'")
  }

  def readData(path: String)(implicit context: String): Unit = {
    println(s"Reading data from '${path}' using the context '${context}'")
  }
}


object Implicits extends App {

  println("------------------------------------------------------")
  val context = "Explicit Context"

  ExplicitContext.runProcess("HELLO WORLD", context)
  ExplicitContext.writeData("HELLO WORLD", "./" , context)
  ExplicitContext.readData("./", context)

  println("------------------------------------------------------")

  implicit val implicitContext: String = "Implicit Context"

  ImplicitContext.runProcess("HELLO WORLD")
  ImplicitContext.writeData("HELLO WORLD", "./")
  ImplicitContext.readData("./")

  println("------------------------------------------------------")

}
