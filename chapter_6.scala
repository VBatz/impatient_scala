
object Hello {
  def main(args: Array[String]) {
    if (args.length > 0) println("Hello " + args(0) + "!")
    else println("Hello World")
  }
}


// Terminal: $ scalac chapter_6.scala
// Terminal: $ scala Hello helpster