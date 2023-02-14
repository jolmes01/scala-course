package basic.introduction

object Loops extends App{
  //Loops While y Do-While
  var counter = 0
  while(counter < 3){
    println("The value in the counter in the loop while is:",counter)
    counter += 1
  }
  counter = 0
  do{
    println("The value in the counter in the loop do while is:",counter)
    counter += 1
  }while(counter < 0)


  //for loop and for comprehensions
  for(i <- 0 to 4){
    println("For loop 1",i)
  }

  for(i <- 0 until 4){
    println("For loop 2",i)
  }

  // One way to do nested for loops
  for(i <- 0 to 4; j <- 0 until 4){
    println("For loop 3, i value",i)
    println("For loop 3, j value",j)
  }

  //For each with collections

  val array = Array(1,2,3,4);
  //or
  val array2 = Array[Int](1,2,3,4);
  array2(0) = 5
  array2(1) = 4
  array2(2) = 3
  array2(3) = 2
  //array2(4) = 1 Error, you can't add values to an array

  //Similar ways
  for(integer <- array2){
    println("For loop 4",integer)
  }
  //array2.foreach(println)

  //For comprehensions
  val array3 =
    for(integer2 <- array2)
      yield integer2
  array3.foreach(println("For loop 5",_))

  val array4 =
    for(integer3 <- array2 if integer3 % 2 == 0)
      yield integer3
  array4.foreach(println("For loop 6",_))
}
