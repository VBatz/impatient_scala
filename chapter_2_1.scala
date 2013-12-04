println("> signum of Int: ")

val x = readInt()

def signum(x: Double) = {
  if (x == 0) 0
  else if (x < 0) -1
  else 1
}

printf("The signum of %d is %d\n.", x, signum(x))
