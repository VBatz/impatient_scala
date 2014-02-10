
val newArray = Array[Int](1, 5, 9, 9, 4, 2, 3)

def likeMkString(input: Array[Int], pre: String, mid: String, post: String) = {
  def repeatMid(i: Int) = Array[String](i.toString, mid)
  val currentArray = input.flatMap(repeatMid).init
  println(pre + currentArray.reduceLeft(_ + _) + post)
}
likeMkString(newArray, "(", ", ", ")")

