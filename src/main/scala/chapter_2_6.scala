println("> String:")

val s: String = readLine()

var sum: Long = 1 // var sum = 1L

for (ch <- s) {
  sum *= ch
}

printf("The unicode-product of %s is %d.\n", s, sum)