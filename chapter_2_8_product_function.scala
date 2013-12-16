println("> String:")

val s: String = readLine()

def product(s: String): Long = {
  var sum = 1L
  for (c <- s) {
    sum *= c // sum = sum * c ZUWEISUNG!!! Wert ist Unit
  }
  sum // Funktion braucht einen Rückgabewert, deswegen muss nach der for-Schleife nochmal sum stehen
}

printf("The unicode-product of %s is %d.\n", s, product(s))