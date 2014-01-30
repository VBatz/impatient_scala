// eins    zwei    drei    vier    fünf    sechs   sieben  acht    neun    zehn    elf zwölf   dreizehn    vierzehn    fünfzehn    sechzehn    siebzehn    achtzehn    neunzehn    zwanzig einundzwanzig   zweiundzwanzig

import scala.io.Source

val source = Source.fromFile("chapter_9_3.txt")

val words = source.mkString.split("\\s+").filter(w => w.length > 12) //oder filter(_.length >12)

println(words.mkString(", "))

