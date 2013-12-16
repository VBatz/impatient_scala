
object Reverse extends App {
  def main(args: Array[String]) {
    if (args.length > 0) {
      for (i -> args.length - 1 to 0) print(args(i) + " ")
    } else println("no arguments to revert")
  }
}