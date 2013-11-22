println("> String: ")

val s: String = readLine()

println("> Which character do you need?")

val n: Int = readInt()

printf("The %d. character from %s is %s.\n", n, s, s substring(n-1,n))
