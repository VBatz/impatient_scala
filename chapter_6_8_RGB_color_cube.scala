

object ColorCube extends Enumeration {
  val White = Value(0xFFFFFF)
  val Gray = Value(0x808080)
  val Black = Value(0x000000)
  val Red = Value(0xFF0000)
  val Yellow = Value(0xFFFF00)
  val Green = Value(0x00800)
  val Blue = Value(0x0000FF)
  val Purple = Value(0x800080)
}

for (c -> ColorCube.values) printf(%c + ": " + %s + "\n", c.id, c)