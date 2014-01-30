// eins    zwei    drei    vier    fünf    sechs   sieben  acht    neun    zehn    elf zwölf   dreizehn    vierzehn    fünfzehn    sechzehn    siebzehn    achtzehn    neunzehn    zwanzig einundzwanzig   zweiundzwanzig

import java.io.PrintWriter
import scala.io.Source

val source = Source.fromFile("textfile_3.txt")

val words = source.mkString.replace('\t', ' ')

println(words)

val out = new PrintWriter("chapter_9_2.rtf")
out.println(words)
out.close()

//FEHLT: n-column-boundaries with tabs