//1.5 0.4 2.9 Zeile eins
//Zeile zwei 1.0 2.5 8.9
//1.3 5.2 Zeile drei 3.1
//5.9 Zeile vier
//Zeile fünf 7 2 7 3 ß
//6.0 3.2 2.0 Zeile sechs

import java.io.PrintWriter
import scala.io.Source

val source = Source.fromFile("chapter_9_7.txt")
val tokens = source.mkString.split("\\s+")

//for (w <- tokens) {
//  if (!w.matches("""([0-9]+.+[0-9])""")) println(w)
//}

tokens.filterNot(_.matches("""([0-9]+.+[0-9])""")).foreach(println)