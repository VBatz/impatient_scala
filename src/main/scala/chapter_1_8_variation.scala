print("> Integer: ")
val x = readInt()
print("> base: ")
val base = readInt()
val random_string = BigInt(x, scala.util.Random).toString(base)
println(random_string)

printf("Random String from Int %d for base %d: %s\n ", x, base, random_string)
