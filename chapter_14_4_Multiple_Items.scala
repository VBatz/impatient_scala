
abstract class Item
case class Article(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, items: Item*) extends Item
case class Multiple(count: Int, item: Item) extends Item

def price(item: Item): Double = item match {
  case Article(_, p) => p
  case Bundle(_, disc, its @ _*) => its.map(price _).sum - disc
  case Multiple(c, its @ _*) => its.map(price _) * c
}

val m = new Multiple(10, Article("Buch", 10.0))
println(m)
println(price(m))