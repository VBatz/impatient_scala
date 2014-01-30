
//1.5 0.4 2.9 1.0 2.5 8.9 1.3 5.2 3.1 5.9 6.0 3.2 2.0

//import java.io.PrintWriter
import scala.io.Source

val source = Source.fromFile("chapter_9_4.txt")

val tokens = source.mkString.split("\\s+")

val numbers = tokens.map(_.toDouble)

val sum = numbers.sum
val avg = sum / numbers.length
val min = numbers.min
val max = numbers.max

//val out = new PrintWriter("chapter_9_4.txt")
println(sum + " " + avg + " " + min + " " + max)
//out.close()
