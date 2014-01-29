
class Point(val xAxis: Int, val yAxis: Int) {
  override def toString = "(x, y) = (" + this.xAxis + ", " + this.yAxis + ")"
}

class Square(cornerPoint: Point, width: Int) extends java.awt.Rectangle(cornerPoint.xAxis, cornerPoint.yAxis, width, width) {

  def this() = this(new Point(0, 0), 0)

  def this(width: Int) = this(new Point(0,0), width)

}

val s1 = new Square()
println(s1)

val s2 = new Square(4)
println(s2)