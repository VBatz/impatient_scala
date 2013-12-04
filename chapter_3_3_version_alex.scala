println("> Integer:")

val n: Int = readInt()

val in = new Array[Int](n)

for (i <- 0 until in.length) {
  in(i) = i
}

val out = (for(i <- in.grouped(2)) yield i.reverse).flatten
// Scala kann in "Gruppen" der Länge x iterieren: array.grouped(x)
// Diese Gruppen werden dann "reversed"
// Das Array ist dann kein "Vektor" mehr, deswegen muss das Ganze wieder "abgeflacht" werden

println(out.mkString(", "))