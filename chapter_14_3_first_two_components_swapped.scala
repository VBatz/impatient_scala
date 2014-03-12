

def swap(array: Array[_ <: Any]) = {
  array match {
    case Array(first, second, rest @ _*) => Array(second, first) ++ rest
    case _ => array
  }
}

var input = Array[Int](0, 1, 2, 3, 4)
println(input.mkString("(",",",")"))

println(swap(input).mkString("(",",",")"))

println(swap(Array("one", "two", "three")).mkString("(",",",")"))
println(swap(Array("one", "two")).mkString("(",",",")"))