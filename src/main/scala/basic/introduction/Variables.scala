package basic.introduction

object Variables extends App{
  //What are values and variables?
  val value = "Hola";
  val space = " ";
  var variable = "Mundo!";

  val hey = value + space + variable
  println(hey)

  variable = "Juan!"
  val hey2 = value + space + variable
  println(hey2)

  val valueSpecifyingType : String = "NoModificable"

}
