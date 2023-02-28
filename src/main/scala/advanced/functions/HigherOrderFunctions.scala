package advanced.functions

object HigherOrderFunctions extends App {

  val list = List(1,2,3,4,5,6,7,8,9)

  //filter only even numbers
  println(list.filter(x => x % 2 == 0))
  //Multiply each element of the list by 2
  println(list.map(x => x * 2))
  //Check if the list has at least one odd number
  println(list.exists(x=> x % 2 != 0 ))

  def isEven(number: Int): Boolean = {
    println(s"Checking if $number is even")
    val isEven = number % 2 == 0
    if(isEven){
      println(s"The number $number is even")
    }else{
      println(s"The number $number is odd")
    }
    isEven
  }
  val list2 = List(1,2,3,4,5,6,7,8,9)
  val filteredList = list2.filter(number => isEven(number))
  println(filteredList)
}

object MyHigherOrderFunctions extends App {

  def applyLogic[A](a: Int, b:Int, f: (Int, Int) => A): A = {
    f(a,b)
  }

  println(applyLogic(23, 23, (a,b) => a+b))
  println(applyLogic(23, 23, (a,b) => s"The given values are $a and $b"))
  applyLogic(23,23, (a,b) => println(a,b))

}
