def lteqgt(values: Array[Int], v: Int) = {
  values.foldLeft((0, 0, 0)) { (res, value) =>
    if (value < v ) {
      (res._1 + 1, res._2, res._3)
    } else if (value == v) {
      (res._1, res._2 + 1, res._3)
    } else {
      (res._1, res._2, res._3 + 1)
    }
  }
}

println(lteqgt(Array(1, 2, 3, 4, 5, 6), 3))
