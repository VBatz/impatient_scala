print("> Integer: ")
val x: Int = readInt()

print("> base: ")

val base: Int = readInt()

val random_string: String = BigInt(x, scala.util.Random).toString(base)
println(random_string)

printf("Random String from Int %d for base %d: %s\n", x, base, random_string)
