import scala.collection.mutable.ArrayBuffer

val a = Array(-2,1,5,-8,-1,0,6,-3,2,1,4,6,8,-2)

var positive = -1

val indexes = ArrayBuffer[Int]()

for (i <- 0 until a.length) {
//  if (i == 0) {
//    positive += 1
//  }
  if (a(i) > 0) {
    positive += 1
    indexes.insert(positive, i)
  }
  else if (a(i) <= 0) {
    indexes.insert(indexes.length, i)
  }
}

val b = new Array[Int](a.length)

for (j <- 0 until a.length) b(j) = a(indexes(j))

println("\nArray in ursprünglicher Reihenfolge: " + a.mkString("(", ", ", ")") + "\n")
println("\nArray in neuer Reihenfolge: " + b.mkString("(", ", ", ")") + "\n")