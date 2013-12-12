
abstract class Conversions(val description: String) {
  def convert(): Unit
}

object inchesToMeters extends Conversions("inch") {
  override def convert() {
    val valueInchesToMeters = value * 2.5
    valueInchesToMeters
  }
}

object gallonsToLiters extends Conversions("gallon") {
  override def convert() {
    val valueGallonsToLiters = value / 1.249
    valueGallonsToLiters
  }
}

object milesToKilometers extends Conversions("mile") {
  override def convert() {
    val valueMilesToKilometers = value * 1.23
    valueMilesToKilometers
  }
}

val inchValue = Conversions("inch")

println(inchValue)
println(inchValue.convert())