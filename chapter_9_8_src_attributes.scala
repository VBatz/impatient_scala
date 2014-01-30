
import scala.io.Source

val source = Source.fromURL("http://www.gutefrage.net")

//val tokens = source.getLines.toArray
val tokens = source.mkString.split("\n+")

val imgPattern = """<img+[a-z0-9\s=\.\":/\_\?&%;-]{2,}+>""".r
val srcPattern = """src="+[a-z0-9/:.\_\?=&\;%-]{4,}+"""".r

val imgsrcPattern = """(<img+[a-z0-9\s=\.\":/\_\?&%;-]{2,}+>) (src="+[a-z0-9/:.\_\?=&\;%-]{4,}+")""".r

for (imgsrcPattern(img, src) <- imgsrcPattern.findAllIn(tokens)) {
  println(src)
}
//val out = new PrintWriter("chapter_9_7.txt")
//for (w <- tokens) if (w.matches("""([0-9]+.+[0-9])""")) {} else println(w)
//out.close()

