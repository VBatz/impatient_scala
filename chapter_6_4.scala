
class Point private (xAxis: Double, yAxis: Double) {
  def show = (xAxis, yAxis)
}

object Point {
  def apply(xAxis: Double, yAxis: Double) = new Point(xAxis, yAxis)
}

val pnt = Point(3,4)
println(pnt.show)
