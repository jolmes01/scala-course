package basic.exercises

object ExceptionsSolution extends App {
  /*
  Exercises
      1. Crash your program with an OutOfMemoryError
      2. Crash with StackOverflowError
      3. Create a calculator that...
        - add(x,y)
        - subtract(x,y)
        - multiply(x,y)
        - divide(x,y)

        Throw
          - OverflowException if add(x,y) exceeds Int.MAX_VALUE
          - UnderflowException if subtract(x,y) exceeds Int.MIN_VALUE
          - MathCalculationException for division by 0
       4. Edit your MyList to throw exceptions in head and tail methods for the Emtpy object
   */

  // 1. This throws an OOM
  val array = Array.ofDim(Int.MaxValue) // This allocates an Array with as many elements as I want

  // 2. This throws a SO
  def infinite: Int = 1 + infinite // This creates a stack recursion
  val noLimit = infinite

  // 3. Calculator
  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalculationException extends RuntimeException("Division by 0")
  object Calculator {
    def add (x: Int, y: Int) = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x < 0 && y < 0 && result > 0) throw new UnderflowException
      else result
    }
    def subtract (x: Int, y: Int) = {
      val result = x + y
      if (x > 0 && y < 0 && result < 0) throw new OverflowException
      else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }

    def multiply(x: Int, y: Int) = {
      val result = x * y
      if(x > 0 && y > 0 && result < 0) throw new OverflowException
      else if(x < 0 && y < 0 && result < 0) throw new OverflowException
      else if(x > 0 && y < 0 && result > 0) throw new UnderflowException
      else if(x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }

    def divide(x: Int, y: Int) = {
      if (y == 0) throw new MathCalculationException
      else x / y
    }
  }

}
