
import java.io.PrintWriter
import scala.math.pow

val out = new PrintWriter("chapter_9_5.txt")
for (i <- 0 to 20) {
  out.println(pow(2, i) + "\t " + 1/pow(2, i))
}
out.close()

// Idee: pow(2, i).padTo(10, ' ')
// Problem: padTo nicht auf Double anwendbar
// Siehe auch Aufgabe 4.7 (da hat es geklappt)
