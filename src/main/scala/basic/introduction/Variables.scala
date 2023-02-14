package basic.introduction

object Variables extends App{
  //What are values and variables?
  val value = "Hello";
  val space = " ";
  var variable = "World!";

  val hey = value + space + variable
  println(hey)

  variable = "Miguel!"
  val hey2 = value + space + variable
  println(hey2)

  val valueSpecifyingType : String = "Value"

}
