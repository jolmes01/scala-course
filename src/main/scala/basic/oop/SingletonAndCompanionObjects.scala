package basic.oop


object SingletonAndCompanionObjects { //Only one instance allocated in memory
  def info(msg:String) = { // Utility or Static Method
    println(msg)
  }

  private def privateInfo(msg:String): Unit ={ //Only myself and my companion class can access myself
    println(msg)
  }
}

class SingletonAndCompanionObjects{ //If you have a object and a class with the same name the singleton object is called a companion object

  def writeAMessage(msg:String): Unit ={
    SingletonAndCompanionObjects.privateInfo(msg)
  }
}


object main extends App{
  import SingletonAndCompanionObjects.info // It can be imported anywhere in the program as a utility method
  //Only one instance
  val singleton =  SingletonAndCompanionObjects
  println(singleton)

  val singleton2 = SingletonAndCompanionObjects
  println(singleton2)

  //Static and Utility type method
  SingletonAndCompanionObjects.info("I am static method")
  info("I also can be called as a utilities method")
  val nonSingletonObject = new SingletonAndCompanionObjects()
  nonSingletonObject.writeAMessage("Hey I'm using a private method from my companion object")

  SingletonAndCompanionObjects.info("This is a Static Method!!")

}