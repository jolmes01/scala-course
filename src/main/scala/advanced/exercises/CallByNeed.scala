package advanced.exercises

object CallByNeed extends App {

  /*
  The following method is a timer that receives the time you set and the desired time for the timer,
  the timer has a panic abort logic that avoids an infinite loop if the timer does not stop in less than 10 seconds
  the timer will abort the execution.

  Check the logic, find the error, fix it and explain the reason for the failure
  */
  def timer(initialTime: => Long, time: Long, cyclesLimit: Int = 10): Unit = {

    lazy val initialTimeByNeed = initialTime
    val targetTime = initialTimeByNeed + time
    var cycles: Int = 1

    while(initialTimeByNeed < targetTime && cycles < cyclesLimit){
      println(s"Waiting... current time millis: ${initialTimeByNeed}.")
      cycles = cycles + 1
      Thread.sleep(1000)
    }

    if(cycles == cyclesLimit){
      println("SHUT IT OFF OTTO!")
    }else{
      println("RING!")
    }

  }

  timer(System.currentTimeMillis, 5000)

}
