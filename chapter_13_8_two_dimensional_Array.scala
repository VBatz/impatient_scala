import scala.collection.mutable.ArrayBuffer

val input = Array[Double](5.6, 4.5, 3.4, 2.3, 1.2, 0.1)

def newArray(arr: Array[Double], columns: Int) = {
  val output = new ArrayBuffer[Array[Double]]()
  val groupedIterator = arr.grouped(columns)
  while (groupedIterator.hasNext) {
    output += groupedIterator.next().toArray
    // println(groupedIterator.next())
  }
  output
}

newArray(input, 3)
println(newArray(input, 3))
newArray(input, 3).foreach(println)
print(newArray(input, 3).foreach(_.mkString("(", ", ", ")")))
//print(newArray(input, 3).foreach(_.toString))


val twoDimensionalArray = newArray(input, 3)

twoDimensionalArray match {
  case a: Array[Double] => println(a.mkString("(", ", ", ")"))
  case _ => print("something else")
}