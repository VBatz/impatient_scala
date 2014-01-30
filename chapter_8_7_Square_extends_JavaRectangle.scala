
class Point(val xAxis: Int, val yAxis: Int) {
  override def toString = "(x, y) = (" + this.xAxis + ", " + this.yAxis + ")"
}

class Square(cornerPoint: Point, width: Int) extends java.awt.Rectangle(cornerPoint.xAxis, cornerPoint.yAxis, width, width) {

  def this() = this(new Point(0, 0), 0)

  def this(width: Int) = this(new Point(0,0), width)

  override def toString = "Square with cornerPoint " + this.cornerPoint.toString + " and width = " + this.width

}

val s1 = new Square()
println(s1)

val s2 = new Square(4)
println(s2)

val s3 = new Square(new Point(4,5), 4)
println(s3)