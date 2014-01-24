
object PlayingCard extends Enumeration {
  val Pik = Value("♠")
  val Karo = Value("♦")
  val Herz = Value("♥")
  val Kreuz = Value("♣")
}

for (c <- PlayingCard.values) println(c.id + ": " + c)

import PlayingCard._

def checkIfColorIsRed(card: PlayingCard.Value) = {
  if (card == Herz ) {
    println("This playing card has color red.")
  } else if (card == Kreuz) {
    println("This playing card has color red.")
  } else println("This playing card has color black.")
}

checkIfColorIsRed(PlayingCard.Kreuz)