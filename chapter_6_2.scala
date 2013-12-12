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

println(anyValue)
println(inchesToMeters.convert(anyValue))
println(gallonsToLiters.convert(anyValue))
println(milesToKilometers.convert(anyValue))