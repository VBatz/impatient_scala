
val in = Map("Muetze" -> 20.0, "Schal" -> 34.99, "Handschuhe" -> 5.95, "Schneeschuhe" -> 80.78)

val out = for ((k,v) <- in) yield (k, v*0.9)

println("\ngizmos:            " + in)
println("discounted gizmos: " + out + "\n")