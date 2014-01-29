
class Point(val xAxis: Double, val yAxis: Double) {
  override def toString = "(x, y) = (" + this.xAxis + ", " + this.yAxis + ")"
}

abstract class Shape {

  def centerPoint: Point
}

class Rectangle(topLeft: Point, bottomRight: Point) extends Shape {

  override val centerPoint = new Point(
    topLeft.xAxis + (bottomRight.xAxis - topLeft.xAxis) / 2,
    topLeft.yAxis + (bottomRight.yAxis - topLeft.yAxis) / 2
  )

}

class Circle(override val centerPoint: Point, radius: Double) extends Shape

val rechteck = new Rectangle(new Point(1,4), new Point(5,8))
println(rechteck.centerPoint)

val kreis = new Circle(new Point(4, 2), 3)
println(kreis.centerPoint)

