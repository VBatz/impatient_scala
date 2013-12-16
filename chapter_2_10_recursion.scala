println("> Double:")

val x: Double = readDouble()

println("> Integer:")

val n: Int = readInt()

def power(x: Double, n: Int): Double = {
  if (n > 0) {
    if (n % 2 == 0) {
      val y = power(x, n / 2)
      y * y
    } else x * power(x, n - 1)
  } else if (n == 0) {
    1
  } else {
    1 / power(x, -n)
  }
}

printf("> Result of " + x + " powered with " + n  + ": " + power(x,n) + "\n")