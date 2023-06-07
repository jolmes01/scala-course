package advanced.functions

object Currying extends App {

  def commonMethod(firstValue: Int, secondValue: Int): Int = {
    firstValue * secondValue
  }

  def multipleArgumentsMethod(firstValue: Int)(secondValue: Int): Int = {
    firstValue * secondValue
  }

  def realCurriedMethod(firstValue: Int): Int => Int = {
    (secondValue: Int) => firstValue * secondValue
  }

  val commonMethodPartiallyApplied = commonMethod(10, _)
  commonMethodPartiallyApplied(10)

  val commonMethodToCurried: Function1[Int, Function1[Int, Int]] = (commonMethod _).curried
  commonMethodToCurried(10)(10)

  val multipleArgumentsMethodPartiallyApplied = multipleArgumentsMethod(10)(_)
  multipleArgumentsMethodPartiallyApplied(10)

  val multipleArgunmentsToCurried = (multipleArgumentsMethod(_: Int)(_: Int)).curried
  multipleArgunmentsToCurried(10)(10)

  realCurriedMethod(10)(10)

}
