import scala.collection.mutable

//val l = mutable.LinkedList(1, 0, 3, 2, 0)
//var l = mutable.LinkedList(1, 0, 0, 3, 2, 0)
var l = mutable.LinkedList(0, 1, 0, 0, 3, 2, 0)

var cur = l
var prev = mutable.LinkedList[Int]()

while (cur != Nil) {
  if (cur.elem == 0) {
  // wenn das aktuelle Element 0 ist
    if (prev == Nil) {
    // Wenn am Anfang der Liste eine 0 steht: LinkedList-Zeiger eine Position weiter schieben
      l = cur.next
    } else {
    // für die restliche Liste
      prev.next = cur.next
    }
  } else {
  // wenn das aktuelle Element nicht 0 ist
    prev = cur
  }
  cur = cur.next
}

println(l)