package advanced.map

object ScalaMap extends App {

  val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
  val nums: Map[Int, Int] = Map()

  // keys
  println( "Keys in colors : " + colors.keys )

  //values
  println( "Values in colors : " + colors.values )

  //isEmpty
  println( "Check if colors is empty : " + colors.isEmpty )
  println( "Check if nums is empty : " + nums.isEmpty )


  val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")

  // Concatenate
  val concatenateColors = colors ++ colors2
  val concatenateMapFunction  = colors.++(colors2)

  println( "colors ++ colors2 : " + concatenateColors )
  println( "colors.++(colors2) : " + concatenateMapFunction )

  //Contains
  if( colors.contains( "red" )) {
    println("Red key exists with value :"  + colors("red"))
  } else {
    println("Red key does not exist")
  }

  // Get
  val color = (key: String) => colors.get(key)

  println("Color value: " + color("red"))

  // Apply
  val blueColor = colors2.apply("blue")

  println(s"Apply color value: $blueColor")

  // Filter
  val result = concatenateColors.filter(x => x._1.contains("r"))
  println("Filter result: " + result)


  // foreach
  concatenateColors.keys.foreach(item => println(concatenateColors.apply(item)))

  concatenateColors.foreach(item => println(s"Key: ${item._1}\t Value: ${item._2}"))


  // map()
  def square(n: Int): Int = { n * n }

  val list = List(1,2,3,4,5)


  val squareList = list.map(item => item * item)

  println(squareList)
  println(list.map(square))

  //filter
  val filteredList = squareList.filter(item => (item % 2) == 0)

  //foreach
  squareList.foreach(println)

  // Apply

  val newList = squareList:+ 1
  println(newList)


}
