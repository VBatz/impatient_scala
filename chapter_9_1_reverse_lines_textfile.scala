
import scala.io.Source

val source = Source.fromFile("chapter_9_1.rtf")

val lineIterator = source.getLines

val contents = source.getLines.toArray

for (l <- contents.reverse) println(l)
