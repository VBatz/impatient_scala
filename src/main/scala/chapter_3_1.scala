import scala.collection.mutable.ArrayBuffer
import scala.util.Random._

println("> Integer:")

val n: Int = readInt()

def randomVector(n: Int) = {
  val rand = ArrayBuffer[Int]()
  for (i <- 0 to n-1) {
    rand += nextInt(n)
  }
  rand
}

println(randomVector(n) +"\n")