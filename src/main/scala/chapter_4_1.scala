
val in = Map[String, Double]("Muetze" -> 20, "Schal" -> 35, "Handschuhe" -> 5, "Schneeschuhe" -> 80)

val out = for ((k,v) <- in) yield (k, v*0.9)

println("\ngizmos:            " + in)
println("discounted gizmos: " + out + "\n")