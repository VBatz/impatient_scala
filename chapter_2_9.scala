println("> String:")

var s: String = readLine()

def recursiveProduct(s: String): Long = {
  if (s.isEmpty) 1 // besser lesbar als if (s.length == 0) 1
  else s.head * recursiveProduct(s.tail)
}

printf("Product of %s is %d.\n", s, recursiveProduct(s))