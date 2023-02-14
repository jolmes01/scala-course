package basic.introduction

import scala.io.Source

object Functions extends App{
  //Scala functions

  def readFile(path:String): String = {
    val file = Source.fromFile(path)
    var content : String = ""

    for(line <- file.getLines()){
      content += line + "\n"
    }

    // There's two ways to return in scala one is using the keyword return and the variable and
    // to just put the thing you want to return
    content //The most common way in scala

  }

  val file = readFile("./lorem_ipsum_prueba.txt")
  println(file)
}
