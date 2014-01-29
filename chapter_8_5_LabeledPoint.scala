
class Point(val xAxis: Double, val yAxis: Double)

class LabeledPoint(val label: String, xAxis: Double, yAxis: Double) extends Point(xAxis, yAxis) {
  override def toString = this.xAxis + ", " + this.yAxis + ", " + this.label
}

val a = new Point(1,1)
println(a.xAxis, a.yAxis)

val b = new LabeledPoint("some point", 2, 4)
println(b)