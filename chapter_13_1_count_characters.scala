

import scala.collection.mutable.Map
import scala.collection.immutable.SortedSet

val input = "Mississippi"

var charCounter = 0
val charIndexes = Map[Char, SortedSet[Int]]()

for (c <- input) {
  if (charIndexes.contains(c)) {
    charIndexes(c) = charIndexes(c) + charCounter
  } else {
    charIndexes += (c -> SortedSet(charCounter))
  }
  charCounter += 1
}

println(charIndexes.mkString("(", ", ", ")"))

val indexes = input.zipWithIndex
val indexMap = Map[Char, Set[Int]]()

for ((c, n) <- indexes) {
  if (indexMap.contains(c)) {
    indexMap(c) = indexMap(c) + n
  } else {
    indexMap += (c -> Set(n))
  }
}

println(indexMap.mkString("(", ", ", ")"))