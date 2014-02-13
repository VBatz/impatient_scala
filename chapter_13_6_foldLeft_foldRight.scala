
val lst = List[Int](1, 2, 3, 4, 5)

val rightFolded = (lst :\ List[Int]())(_ +: _).reverse

val leftFolded = (List[Int]() /: lst)(_ :+ _)

println(lst)
println(rightFolded)
println(leftFolded)