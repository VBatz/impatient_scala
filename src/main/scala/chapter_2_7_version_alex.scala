println("> String:")

val s: String = readLine()

printf("Product of the characters of %s is %d.\n", s, s.foldLeft(1L) {(product, c) => product * c})