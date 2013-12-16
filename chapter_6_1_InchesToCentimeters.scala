
object Conversions {
  def inchesToMeters(value: Double) = {
    value * 1.3
  }
  def gallonsToLiters(value: Double) = {
    value / 2
  }
  def milesToKilometers(value: Double) = {
    value * 1.3
  }
}

val in = Conversions

println(in)
println(in.inchesToMeters(4))
println(in.gallonsToLiters(4))
println(in.milesToKilometers(4))
