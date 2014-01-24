
object PlayingCard extends Enumeration {
  val Pik = Value("♠")
  val Karo = Value("♦")
  val Herz = Value("♥")
  val Kreuz = Value("♣")
}

for (c <- PlayingCard.values) println(c.id + ": " + c)
