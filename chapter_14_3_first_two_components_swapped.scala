
var input = Array[Int](0, 1, 2, 3, 4)

println(input.mkString("(",",",")"))

def swap(arrayOfInts: Array[Int]) = {
  var output = arrayOfInts
  arrayOfInts match {
    case Array(first, second, _*) => {
      output(first) = second
      output(second) = first
    }
  }
  output
}

println(swap(input).mkString("(",",",")"))