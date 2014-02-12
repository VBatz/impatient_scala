
val prices = List(5.0, 20.0, 9.95)
val quantities = List(10, 2, 1)

val priceOfItems = (prices zip quantities) map { p => p._1 * p._2 }

println(priceOfItems)
//val priceOfItemsNEW = (prices zip quantities) map { p => p.tupled(*))}
//tupled[a1, a2, b](f: (a1, a2) ⇒ b): ((a1, a2)) ⇒ b

val priceOfItemsNEW = tupled(prices zip quantities, *)