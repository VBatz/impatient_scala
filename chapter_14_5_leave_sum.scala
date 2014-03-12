
val input = List[Any](List(3, 8), 2, List(5))

println(input)

def leafSum(lst: List[Any]) = lst match {
  case h::t => leafSum(h) + leafSum(t)
}

println(leafSum(input))