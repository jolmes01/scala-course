package basic.exercises

abstract class MyListInClassCC { //We want to make this an immutable list because we create a new list on every function that returns a MyListInClassCC type

  def head: Int
  def tail: MyListInClassCC
  def isEmpty: Boolean
  def add(element: Int): MyListInClassCC
  def printElements: String

  // polymorphic call
  override def toString: String = "[" + printElements + "]"
}

case object EmptyInClassCC extends MyListInClassCC {
  def head: Int = ??? // Leave this for exceptions
  def tail: MyListInClassCC = ??? // Leave this for exceptions
  def isEmpty: Boolean = true
  def add(element: Int): MyListInClassCC = new ConsInClassCC(element, EmptyInClassCC)

  def printElements: String = ""
}

case class ConsInClassCC(h: Int, t: MyListInClassCC) extends MyListInClassCC {
  def head: Int = h
  def tail: MyListInClassCC = t
  def isEmpty = false
  def add(element: Int): MyListInClassCC = new ConsInClassCC(element, this)

  def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
}

object ListTestInClassCC extends App {
  val list = ConsInClassCC(1, EmptyInClassCC)
  println(list.head)
}

