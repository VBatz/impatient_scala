
val prices = List(5.0, 20.0, 9.95)
val quantities = List(10, 2, 1)

def mult = (x: Double, y: Int) => x * y.toDouble

val priceOfItems = (prices zip quantities) map mult.tupled

println(priceOfItems)
