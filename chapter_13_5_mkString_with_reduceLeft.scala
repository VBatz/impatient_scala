
val newArray = Array(1, 5, 9, 9, 4, 2, 3)

def likeMkString(input: Seq[Any], mid: String, pre: String = "(", post: String = ")") = {
  pre + input.reduceLeft(_ + mid + _) + post
}

println(likeMkString(newArray, mid = ", "))
println(likeMkString(Array("one", "two"), mid = ", "))