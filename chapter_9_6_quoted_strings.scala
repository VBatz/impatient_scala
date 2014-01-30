// This is a "string" that will be highlighted when your regular "expression" matches something.

import scala.io.Source

val source = Source.fromFile("chapter_9_6.txt")
val words = source.mkString.split("\\s+")  //.filter(s => s == """\"+[a-z]+\"""".r)

for (w <- words) {
  if (w.matches("""\"+[a-z]+\"""")) println(w)
}
