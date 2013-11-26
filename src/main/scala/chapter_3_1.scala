import scala.util.Random._

println("> Integer:")

val n: Int = readInt()

def randomVector(n: Int) = {
  val rand = new Array[Int](n)
  for (i <- 0 to n - 1) {
    rand(i) = nextInt(n)
  }
  rand
}

println(randomVector(n).mkString(", ") +"\n")