
sealed abstract class BinaryTree
case class Leaf(value: Int) extends Tree
case class Node(left: Tree, right: Tree) extends Tree

val input = Node (
  Node(
    Leaf(3),
    Leaf(8)
  ),
  Node(
    Leaf(2),
    Leaf(5)
  )
)

println(input)

def leafSum(tree: Tree) : Int = tree match {
  case Leaf(value) => value
  case Node(left, right) => leafSum(left) + leafSum(right)
}

println(leafSum(input))