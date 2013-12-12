// abstrakte Klasse: override UND ohne override funktioniert
// Klassennamen fangen immer mit Großbuchstaben an!!!

abstract class Conversions {
  def convert(value: Double): Double
  // abstrakte Methode => keine Implementierung in der Klasse => override nicht nötig
}

object inchesToMeters extends Conversions {
  override def convert(value: Double) = value * 2.5
}

object gallonsToLiters extends Conversions {
  override def convert(value: Double) = value / 1.249
}

object milesToKilometers extends Conversions {
  override def convert(value: Double) = value * 1.23
}

val anyValue: Double = 10

println("original value: ".padTo("miles to kilometers: ".length, ' ') + anyValue)
println("inches to meters: ".padTo("miles to kilometers: ".length, ' ') + inchesToMeters.convert(anyValue))
println("gallons to liters: ".padTo("miles to kilometers: ".length, ' ') + gallonsToLiters.convert(anyValue))
println("miles to kilometers: " + milesToKilometers.convert(anyValue))