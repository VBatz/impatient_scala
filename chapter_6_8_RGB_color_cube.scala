

object ColorCube extends Enumeration {
  val White = Value(0xFFFFFF, "White")
  val Gray = Value(0x808080, "Gray")
  val Black = Value(0x000000, "Black")
  val Red = Value(0xFF0000, "Red")
  val Yellow = Value(0xFFFF00, "Yellow")
  val Green = Value(0x00800, "Green")
  val Blue = Value(0x0000FF, "Blue")
  val Purple = Value(0x800080, "Purple")
}

for (c <- ColorCube.values) println("0x%06x: %s".format(c.id, c))
