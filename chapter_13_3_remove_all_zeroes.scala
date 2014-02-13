import scala.collection.mutable

// linkedList mit filter oder ähnlichem siehe Seite 165f

val listOfIntegers = mutable.LinkedList[Int](1, 0, 0, 5, 5, 5, 6, 7, 6, 1, 0, 3, 0, 7, 2, 9, 11, 20, 0, 33, 1, 0, 0, 7)
println("listOfIntegers: " + listOfIntegers)

var currentListWithZeroes = listOfIntegers
var cur = listOfIntegers

//def removeAllZeroes(list: mutable.LinkedList[Int]) {
while (cur != Nil) {
  while (cur.elem == 0 && cur.next != Nil && cur.next.next != Nil) {
    cur.elem = cur.next.elem
    cur.next = cur.next.next
    cur = cur.next
  }
  while (cur.elem == 0 && cur.next != Nil && cur.next.next.isEmpty) {
    cur.elem = cur.next.elem
    cur = cur.next
  }
  cur = cur.next
}
/*
  while (cur != Nil) {
    if (cur.elem == 0 && cur.next != Nil && cur.next.next != Nil) {
      cur.elem = cur.next.elem
      cur.next = cur.next.next
    } else if (cur.elem == 0 && cur.next != Nil && cur.next.next.isEmpty) {
      cur.elem = cur.next.elem
    }
      cur = cur.next
  }
*/
//}

println("listOfIntegers: " + listOfIntegers)
//println(removeAllZeroes(listOfIntegers))

val listWithoutZeroes = currentListWithZeroes.filter(c => c > 0)
println("listWithoutZeroes: " + listWithoutZeroes)
