println("> Int: ")

val n: Int = readInt()

println("> Countdown: ")

for (i <- n to 0 by -1) {
  print(i + " ")
}

println()