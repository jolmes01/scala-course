package basic.exercises

abstract class MyListInClass { //We want to make this an immutable list because we create a new list on every function that returns a MyListInClass type

  def head: Int
  def tail: MyListInClass
  def isEmpty: Boolean
  def add(element: Int): MyListInClass
  def printElements: String

  // polymorphic call
  override def toString: String = "[" + printElements + "]"
}

object EmptyInClass extends MyListInClass {
  def head: Int = ??? // Leave this for exceptions
  def tail: MyListInClass = ??? // Leave this for exceptions
  def isEmpty: Boolean = true
  def add(element: Int): MyListInClass = new ConsInClass(element, EmptyInClass)

  def printElements: String = ""
}

class ConsInClass(h: Int, t: MyListInClass) extends MyListInClass {
  def head: Int = h
  def tail: MyListInClass = t
  def isEmpty = false
  def add(element: Int): MyListInClass = new ConsInClass(element, this)

  def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
}

object ListTests extends App {
  val list = new ConsInClass(1, EmptyInClass)
  println(list.head)
}

