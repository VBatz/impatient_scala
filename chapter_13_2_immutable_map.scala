

import scala.collection.immutable.Map
import scala.collection.mutable.LinkedList

val input = "Mississippi"

var charCounter = 0
var charIndexes = Map[Char, LinkedList[Int]]()
var charList = LinkedList[Int]()

for (c <- input) {
  if (charIndexes.contains(c)) {
    charList = charIndexes(c) :+ charCounter
  } else {
    charList = LinkedList(charCounter)
  }
  charIndexes = charIndexes + (c -> charList)
  charCounter += 1
}

println(charIndexes.mkString("(", ", ", ")"))

val indexes = input.zipWithIndex
var indexMap = Map[Char, LinkedList[Int]]()
var indexList = LinkedList[Int]()

for ((c, n) <- indexes) {
  if (indexMap.contains(c)) {
    indexList = indexMap(c) :+ n
  } else {
    indexList = LinkedList(n)
  }
  indexMap = indexMap + (c -> indexList)
}

println(indexMap.mkString("(", ", ", ")"))