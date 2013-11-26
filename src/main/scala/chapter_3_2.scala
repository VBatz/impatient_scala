println("> Integer:")

val n: Int = readInt()

val a = new Array[Int](n)

for (i <- 0 until a.length) {
  a(i) = i
}

val indexes = for (i <- 0 until a.length) yield {
  if (i % 2 == 0) {
    if (i == a.length - 1) i
    else i+1
  }
  else i - 1
}

val b = new Array[Int](a.length)

for (j <- 0 until indexes.length) b(j) = a(indexes(j))

println(b.mkString(", "))