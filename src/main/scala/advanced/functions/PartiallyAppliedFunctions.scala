package advanced.functions

object PartiallyAppliedFunctions extends App {

  def calculateWeight(gravity: Double, mass: Double): Double = {
    gravity * mass
  }

  val weightInMars = calculateWeight(3.721, _)
  val weightInEarth = calculateWeight(9.81, _)
  val weightInVenus = calculateWeight(8.87, _)
  val weightInPluto = calculateWeight(0.62, _)

  val massList = List(10.15, 23.23, 15.14, 23.73, 15.14)

  massList.foreach(weightInMars)
  massList.foreach(weightInEarth)
  massList.foreach(weightInPluto)
  massList.foreach(weightInVenus)

  // Create a method to make a payment with multiples payment types like: card, bank transfer, cash (you have to define the payment method by passing it as an String)
  // Create multiples vals by partial applying the previous method and use those val to perform some payments

}
