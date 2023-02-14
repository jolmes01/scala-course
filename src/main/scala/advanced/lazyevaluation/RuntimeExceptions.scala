package advanced.lazyevaluation

import advanced.lazyevaluation.SavingTimeAndResources.lazyEvaluation

object RuntimeExceptions extends App {
  val error = throw new RuntimeException()
}

object LazyRuntimeExceptions extends App {
  lazy val error = throw new RuntimeException()
  //Uncomment below line and run it again
  //println(error)
}

object SavingTimeAndResources extends App {
  lazy val longTimeLogic = {
    println("Running for a long time")
    println("Consuming a lot of resources")
    println("Finishing the calculations...")
    "I am the result of a long time run."
  }

  def lazyEvaluation(willBeCalculated: Boolean = false): Unit = {
    if (willBeCalculated) {
      println(longTimeLogic)
    } else {
      println("We have saved a lot of resources and time")
    }
  }

  println("** First run **")
  lazyEvaluation()

  println("** Second run **")
  lazyEvaluation(true)

}

object ConditionLazyEvaluation extends App {

  lazy val longTimeLogic = {
    println("Running for a long time")
    println("Consuming a lot of resources")
    println("Finishing the calculations...")
    true
  }

  def andCondition(defaultCondition: Boolean = false): Unit = {
    if (defaultCondition && longTimeLogic) {
      println(true)
    } else {
      println(false)
    }
  }

  println("** First run **")
  andCondition()

  println("** Second run **")
  andCondition(true)
}
