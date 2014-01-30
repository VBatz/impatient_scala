
import scala.io.Source

val source = Source.fromURL("http://www.gutefrage.net")

val tokens = source.mkString

val pattern = """<img[^>]*src="{[^"]*}"[^>]*>""".r

for (pattern(src) <- pattern.findAllIn(tokens)) {
  println(src)
}
//val out = new PrintWriter("chapter_9_7.txt")
//for (w <- tokens) if (w.matches("""([0-9]+.+[0-9])""")) {} else println(w)
//out.close()

