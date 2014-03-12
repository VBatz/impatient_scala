sealed abstract class Tree
case class Leaf(value: Int) extends Tree
case class Node(children: Tree*) extends Tree

val input = Node (
  Node(
    Leaf(3),
    Node(
      Leaf(8),
      Leaf(0)
    )
  ),
  Node(
    Leaf(2),
    Leaf(5)
  ),
  Node(
    Leaf(2)
  )
)

def leafSum(tree: Tree) : Int = tree match {
  case Leaf(value) => value
  case Node(children @ _*) => children.map(leafSum).sum  // hier lesbarer, aber bei Millionen Einträgen nicht sinnvoll
}

def leafSumWithFold(tree: Tree) : Int = tree match {
  case Leaf(value) => value
  case Node(children @ _*) => children.foldLeft(0) { (sum, elem) =>
    sum + leafSumWithFold(elem)}
}

println(input)
println(leafSum(input))
println(leafSumWithFold(input))