println("> Integer:")

val n: Int = readInt()

val a = new Array[Int](n)

for (i <- 0 until a.length) {
  a(i) = i
}

printf("\nArray a with %d elements: " + a.mkString("(", ", ", ")") + "\n", n)

for (i <- 0 until a.length if i % 2 == 1) {
  val x = a(i)
  a(i) = a(i-1)
  a(i-1) = x
}

println("\nSwapped adjacent elements of Array a: " + a.mkString("(", ", ", ")") + "\n")
