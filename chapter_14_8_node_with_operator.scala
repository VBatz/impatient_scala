abstract class Operator
/*case class Add extends Operator
case class Subtract extends Operator
case class Multiply extends Operator
*/
sealed abstract class Tree
case class Leaf(value: Int) extends Tree
/*case class Node(operator: Operator, children: Tree*) extends Tree
*/case class Node(operator: String, children: Tree*) extends Tree

val input = Node (
//  Add(),
  "+",
  Node(
//    Multiply(),
    "*",
    Leaf(3),
    Leaf(8)
  ),
  Leaf(2),
  Node(
//    Subtract(),
    "-",
    Leaf(5)
  )
)

def eval(tree: Tree) : Int = {
  tree match {
    case Leaf(value) => value
    case Node(operator, children @ _*) => { // ACHTUNG: HÄSSLICH!!!
      operator match {
        case "+" => children.map(eval).foldLeft(0) {_ + _}
        case "*" => children.map(eval).foldLeft(1) {_ * _}
        case "-" => children.map(eval).foldLeft(0) {_ - _}
      }
    }
  }
}

println(input)
println(eval(input))
