package basic.oop

object Exceptions extends App {


  val x: String = null
  println(x.length) // So exceptions are a technical and sweet name for the miserable situation where your program crashes
  // This ^^ will crash with NullPointerException

  // To avoid this, the technical terms are throwing and catching exceptions

  // 1. How to throw exceptions
  throw new NullPointerException

  // 2. How to catch exceptions
  def getInt(withExceptions: Boolean): Int =
    if(withExceptions) throw new RuntimeException("No int for you")
    else 10

  try {
    // PUT the code that might fail here
    getInt(true)
  } catch {
    // HERE we are going to try to match what kind of exception might be thrown in here
    case e: RuntimeException => println("caught a RuntimeException")
  } finally {
    // HERE we have the code that will get executed NO MATTER what
    println("finally")
  }

  // Let's change case e: RuntimeException by case e: NullPointerException and see what happens

  // 3. How to define your own exceptions
  class MyException extends Exception
  val exception = new MyException

  throw exception // THIS will crahs the program with MyException

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
}
