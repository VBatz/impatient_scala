// Version OHNE MUTABLE COLLECTIONS (eigentlich 13.2)
import scala.collection.immutable.SortedSet

def characterIndices(word: String) = {
  word.zipWithIndex.foldLeft(Map[Char, SortedSet[Int]]()) { case (m, (c, i)) =>
    m + (c -> (m.getOrElse(c, SortedSet(i)) + i))
  }
}

println(characterIndices("Mississippi").toString())