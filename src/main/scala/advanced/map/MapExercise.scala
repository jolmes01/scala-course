package advanced.map

import scala.io.Source

object MapExercise extends App {
  def readFile(fileName: String): List[String] = {
    val resource = s"${System.getProperty("user.dir")}/src/main/scala/advanced/map"

    val buffer = Source.fromFile(s"${resource}/${fileName}")

    val linesInFile = for (line <- buffer.getLines) yield line

    linesInFile.toList
  }

  val lines = readFile("file.txt").flatMap(_.replaceAll("[\\,|\\.]", "").split(" "))


  lines.groupMapReduce(key => key)(_ => 1)(_+_).foreach(println)




}
