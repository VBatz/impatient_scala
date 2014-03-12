
abstract class Item
case class Article(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, items: Item*) extends Item
case class Multiple(count: Int, item: Item) extends Item

def price(item: Item): Double = item match {
  case Article(_, p) => p
  case Bundle(_, disc, its @ _*) => its.map(price _).sum - disc
  case Multiple(c, item) => price(item) * c
}

val m = Multiple(10, Article("Buch", 10.0))
println(m)
println(price(m))

println(price(Multiple(10, Bundle("Bücher und Schränke", 10.0, Article("Buch", 15.0), Article("Schrank", 300.0)))))
println(price(Multiple(10, Multiple(5, Bundle("Bücher und Schränke", 10.0, Article("Buch", 15.0), Article("Schrank", 300.0))))))
