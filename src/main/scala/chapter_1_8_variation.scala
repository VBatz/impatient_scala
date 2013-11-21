print("> Integer: ")
val x = readInt()
print("> base: ")
val base = readInt()
println(BigInt(x, scala.util.Random).toString(base))

printf("Random String from Int %d for base %d: %s\n ", x, base, BigInt(x, scala.util.Random).toString(base))
