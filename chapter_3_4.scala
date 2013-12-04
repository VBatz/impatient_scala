import scala.collection.mutable.ArrayBuffer

val a = Array(-2,1,5,-8,-1,0,6,-3,2,1,4,6,8,-2)

println("\nArray in ursprünglicher Reihenfolge: " + a.mkString("(", ", ", ")"))

var positive = -1

val b = ArrayBuffer[Int]()

for (i <- 0 until a.length) {
  if (a(i) > 0) {
    positive += 1
    b.insert(positive, a(i))
  }
  else if (a(i) <= 0) {
    b.insert(b.length, a(i))
  }
}

println("\nArray in neuer Reihenfolge: " + b.mkString("(", ", ", ")") + "\n")