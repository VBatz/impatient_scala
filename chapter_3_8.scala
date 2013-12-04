import scala.collection.mutable.ArrayBuffer

val a = Array(-2,1,5,-8,-1,0,6,-3,2,1,4,6,8,-2)

println("\nOriginal array: " + a.mkString("(", ", ", ")"))

val indexes = for (i <- 0 until a.length if a(i) < 0) yield i

println("\nindexes: " + indexes.mkString("(", ", ", ")"))

val reverseIndexes = indexes.reverse

println("\nreverseIndexes: " + reverseIndexes.mkString("(", ", ", ")"))

val dropReverseIndexes = reverseIndexes.dropRight(1)

println("\ndropReverseIndexes: " + dropReverseIndexes.mkString("(", ", ", ")"))

val b = ArrayBuffer[Int]()

b ++= a

for (i <- 0 until dropReverseIndexes.length) b.remove(dropReverseIndexes(i))

println("\nNew array: " + b.mkString("(", ", ", ")") + "\n")
