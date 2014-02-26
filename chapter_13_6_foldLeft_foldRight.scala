
val lst = List[Int](1, 2, 3, 4, 5)

//val rightFolded = (lst :\ List[Int]())(_ :: _).reverse
//val rightFolded = (lst :\ List[Int]())((i, list) => i +: list).reverse
val rightFolded = (lst :\ List[Int]())((i, list) => list :+ i)

val leftFolded = (List[Int]() /: lst)(_ :+ _)

println(lst)
println((lst :\ List[Int]())(_ :: _))
println(rightFolded)
println(leftFolded)