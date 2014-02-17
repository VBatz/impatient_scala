
import scala.io.Source
val fileNames = Seq("chapter_9_3.txt", "chapter_9_6.txt", "chapter_9_7.txt")


val source = Source.fromFile("chapter_9_3.txt")
val contents = source.mkString

import scala.collection.mutable
val frequencies = new mutable.HashMap[Char, Int] with scala.collection.mutable.SynchronizedMap[Char, Int]

for (c <- contents) {
  frequencies(c) = frequencies.getOrElse(c, 0) + 1
}

println(frequencies)

/*
import scala.collection.JavaConversions.asScalaConcurrentMap

val freQuencies: scala.collection.mutable.ConcurrentMap[Char, Int] = new java.util.concurrent.ConcurrentHashMap[Char, Int]

for (c <- input) {
  freQuencies(c) = freQuencies.getOrElse(c, 0) + 1
}

println(freQuencies)
*/

