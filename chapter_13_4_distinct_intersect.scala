

def distinctIntersect(values: Array[String], valueMap: Map[String, Int]) = {
  var intersect = Map[String, Int]()
  for (c <- values) {
    if (valueMap.contains(c)) {
      intersect = intersect + (c -> valueMap(c))
    }
  }
  intersect
}

val Names = Array[String]("Tom", "Fred", "Harry")
val NameNumbers = Map[String, Int]("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)

println(distinctIntersect(Names, NameNumbers))



def distInctersect(values: Array[String], valueMap: Map[String, Int]) = {
  println(values.flatMap(valueMap.get(_)).mkString("(", ", ", ")"))
}

distInctersect(Names, NameNumbers)