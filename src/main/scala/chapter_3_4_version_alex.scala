import scala.collection.mutable.ArrayBuffer

val a = Array(-2,1,5,-8,-1,0,6,-3,2,1,4,6,8,-2)

println("\nArray in ursprünglicher Reihenfolge: " + a.mkString("(", ", ", ")"))

var positive = -1

val b = ArrayBuffer[Int]()

b ++= a.filter{ _ > 0} ++ a.filter{ _ <= 0}

println("\nArray in neuer Reihenfolge: " + b.mkString("(", ", ", ")") + "\n")