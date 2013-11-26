import scala.util.Random

println("> Integer:")

val n: Int = readInt()

val randoms = for (i <- 0 until n) yield Random.nextInt(n)

println(randoms +"\n")