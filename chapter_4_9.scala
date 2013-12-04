val a = Array(-2,1,5,-8,-1,0,6,-3,2,1,4,6,8,-2)

println("> Integer:")

val n = readInt()

def lteqgt(a: Array[Int], n: Int) = {
  var less = 0
  var equal = 0
  var greater = 0
  (0 until a.length).foreach {
    case i => {
      if (a(i) < n) less += 1
      if (a(i) == n) equal += 1
      if (a(i) > n) greater += 1
    }
  }
  (less, equal, greater)
}
println("\nArray: " + a.mkString("(", ", ", ")"))
printf("\nCount elements less than / equal to / greater than %d:", n)
println("\nlteqgt: " + lteqgt(a, n) + "\n")