import scala.collection.mutable.ArrayBuffer

val in = java.util.TimeZone.getAvailableIDs

val out = ArrayBuffer[String]()

for ( i <- 0 until in.length if in(i).startsWith("America")) yield out += in(i).drop(8)

println("\nTime zones of America: \n" + out.mkString("(", ", ", ")") + "\n")