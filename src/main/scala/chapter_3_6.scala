import scala.collection.mutable.ArrayBuffer

val a = Array(-2,1,5,-8,-1,0,6,-3,2,1,4,6,8,-2)

println("\nOriginal array: " + a.mkString("(", ", ", ")"))

println("\nArray: " + a.reverse.mkString("(", ", ", ")"))

val b = ArrayBuffer[Int]()

b ++= a

println("\nArrayBuffer: " + b.reverse.mkString("(", ", ", ")") + "\n")