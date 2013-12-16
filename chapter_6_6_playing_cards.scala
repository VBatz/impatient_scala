
object PlayingCards extends Enumeration {
  val Black1 = Value(Pik, ♠)
  val Black2 = Value(Karo, ♦)
  val Red1 = Value(Herz, ♥)
  val Red2 = Value(Kreuz, ♣)
}

for (i -> 0 until 4) println(PlayingCards(i))