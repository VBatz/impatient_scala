import scala.collection.JavaConversions.propertiesAsScalaMap

val props: scala.collection.Map[String, String] = System.getProperties

val keys = props.keys

var max = 0

for (i <- keys) if (i.length > max) max = i.length

println("\nMaximale Länge " + max)

for ((k, v) <- props) {
  println(k.padTo(max, ' ') + " | " + v) // k + " " * (max - k.length) ODER k.padTo(max, ' ')
}