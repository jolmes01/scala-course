package basic.introduction

object ConditionalsAndScopes extends App{

  //if if-else if else-if else if one liners matchers conditions
  val num1 = 10;
  val num2 = 20;


  //If
  if(num1 == num2){
    println("They are the same!");
  }

  //If else
  if(num1 == num2){
    println("They are the same!");
  }else{
    println("They are different");
  }

  //If else if else
  if(num1 == num2){
    println("They are the same!");
  }else if(num1 > num2){
    println("The first number is bigger than the second!");
  }else{
    println("The second number is bigger than the first one!");
  }

  //If one liner
  if(num1 == num2)
    println("They are the same!")
  else if(num1 > num2)
    println("The first number is bigger than the second!");
  else
    println("The second number is bigger than the first one!");

  val result = if(num1 == num2) "They are the same!" else if(num1 > num2) "The first number is bigger than the second!" else "The second number is bigger than the first one!";
  println(result)

  //matchers
  num1 match {
    case 10 => {
      println("It's 10!")
    }
    case 20 => println("It's 20!")
    case _ => println("It's not 10 nor 20")
  }

  val result2 = num1 match {
    case x if x == num2 => "They are the same!"
    case x if x > num2 => "The first number is bigger than the second!"
    case _ => "The second number is bigger than the first one!"
  }
  println(result2)


  //Scopes
  val scopeTest = 1
  println("Scope main",scopeTest)

  {
    val scopeTest = 2
    println("Scope dentro de main",scopeTest)
  }

  println("Scope main",scopeTest)

}
