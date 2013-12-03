val a = Array(-2,1,5,-8,-1,0,6,-3,2,1,4,6,8,-2)

def minmax(a: Array[Int]) = {
  var min = 0
  var max = 0
  for (i <- 0 until a.length) {
    if (a(i) < min) min = a(i)
    if (a(i) > max) max = a(i)
  }
  (min, max)
}

println("\nArray: " + a.mkString("(", ",", ")") + "\n")
println("\nMin und Max: " + minmax(a))