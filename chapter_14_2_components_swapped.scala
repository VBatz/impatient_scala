
def swap(pairOfInts: (Int, Int)) = {
  println(pairOfInts)
  var output = pairOfInts
  pairOfInts match {
    case (x, y) => output = (y, x)
  }
  println(output)
}

swap((4,6))