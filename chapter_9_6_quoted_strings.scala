// This is a "string" that will be highlighted when your regular "expression" matches something.

import scala.io.Source

val source = Source.fromFile("chapter_9_6.txt")
val words = source.mkString.split("\\s+")

for (w <- words) {
  if (w.matches("""\"+[a-z]+\"""")) println(w)
}

println("-------------")

val s = Source.fromFile("chapter_9_6.txt").mkString
val r = """"[^"]+"""".r

r.findAllIn(s).foreach(println)

println("-------------")

val ss = Source.fromFile("chapter_9_6_quoted_strings.scala").mkString
val rr = """"+[^"]+"+""".r

rr.findAllIn(ss).foreach(println)