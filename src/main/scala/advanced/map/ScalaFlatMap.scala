package advanced.map

object ScalaFlatMap extends App {

  val list = Seq("Hola", "Scala")

  // Applying map()
  val map = list.map(_.toLowerCase) // Output: List(hola, scala)

  // Applying flatten() now,
  val result = map.flatten // Output: List(h,o,l,a,s,c,a,l,a)

}
