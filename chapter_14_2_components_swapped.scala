
def swap(pairOfInts: (Int, Int)) = {
  pairOfInts match {
    case (x, y) => (y, x)
  }
}

val input = (4, 6)
println(input)

println(swap(input))
