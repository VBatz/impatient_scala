
abstract class Item {

  def price: Double

  def description: String
}

class SimpleItem(override val price: Double, override val description: String) extends Item

class Bundle extends Item {

  import scala.collection.mutable.ListBuffer
  private val bundleContent = new ListBuffer[Item]()

  def addItem(item: Item) = {
    bundleContent += item
  }

  def price = {
    var sum: Double = 0
    for (c <- bundleContent) sum += c.price
    sum
  }

  def description = {
    var output: String = ""
    for (c <- bundleContent) output = output + c.description + " "
    output
  }
}

val auto = new SimpleItem(1234.56, "Traktor")
val werkzeug = new SimpleItem(789.01, "Heugabel")
val schuh = new SimpleItem(23.45, "Gummistiefel")

val alles = new Bundle
alles.addItem(auto)
alles.addItem(werkzeug)
alles.addItem(schuh)
println(alles.description)
println(alles.price)