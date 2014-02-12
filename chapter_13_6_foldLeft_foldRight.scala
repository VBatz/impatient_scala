
val lst = List[Int](1, 2, 6, 8, 4, 9, 4, 5)

val rightFolded = (lst :\ List[Int]())(_ :: _)

val leftFolded = (List[Int]() /: lst)(_ :+ _)

println(lst)
println(rightFolded)
println(leftFolded)