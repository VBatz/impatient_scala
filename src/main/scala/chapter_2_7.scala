println("> String:")

val s: String = readLine()

printf("Product of the characters of %s is %d.\n", s, s.map(_.toLong).product)

// s.map(_.toLong).product ist das selbe wie s.map(c => c.toLong)).product
