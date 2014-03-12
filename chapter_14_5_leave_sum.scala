
val input = List[Any](List(3, 8), 2, List(5))

println(input)

def leafSum(lst: List[Any]) : Int = {
  lst.foldLeft(0) { (sum, elem) =>
    elem match {
      case x: Int => sum + x
      case l: List[Any] => sum + leafSum(l)
    }
  }
}

println(leafSum(input))
println(leafSum(List.empty))