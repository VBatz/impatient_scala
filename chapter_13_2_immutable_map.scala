

import scala.collection.immutable.Map

val input = "Mississippi"

var charCounter = 0
var charIndexes = Map[Char, Set[Int]]()

for (c <- input) {
  if (charIndexes.contains(c)) {
    charIndexes = charIndexes + (c -> (charIndexes(c) + charCounter))
  } else {
    charIndexes = charIndexes + (c -> Set(charCounter))
  }
  charCounter += 1
}

println(charIndexes.mkString("(", ", ", ")"))

val indexes = input.zipWithIndex
var indexMap = Map[Char, Set[Int]]()

for ((c, n) <- indexes) {
  if (indexMap.contains(c)) {
    indexMap = indexMap + (c -> (indexMap(c) + n))
  } else {
    indexMap = indexMap + (c -> Set(n))
  }
}

println(indexMap.mkString("(", ", ", ")"))