
import java.io.PrintWriter
import scala.math.pow

val out = new PrintWriter("chapter_9_5.txt")
for (i <- 0 to 20) {
  var value = pow(2, i)
  out.println(value.toInt.toString.padTo(10, ' ') + "\t " + 1/value)
}
out.close()
