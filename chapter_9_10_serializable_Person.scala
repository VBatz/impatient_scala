import scala.collection.mutable.ArrayBuffer

class Person(val name: String) extends Serializable {
  private val friends = new ArrayBuffer[Person]

  def getFriends(newFriend: Person) {
    friends += newFriend
  }

  def currentFriends = {
    println("Friends of " + this.name + ": " + friends.mkString(", "))
  }

  override def toString = this.name
}

val fred = new Person("Fred")
val john = new Person("John")
val jane = new Person("Jane")
val mary = new Person("Mary")

fred.getFriends(john)

john.getFriends(fred)
john.getFriends(mary)

mary.getFriends(john)
mary.getFriends(jane)

john.currentFriends

val allMyPersons = Array[Person](john, fred, jane, mary)

import java.io._

//val out = new ObjectOutputStream(new FileOutputStream("chapter_9_10.obj"))
//out.writeObject(fred)
//out.close()

//val in = new ObjectInputStream(new FileInputStream("chapter_9_10.obj"))
//val savedFred = in.readObject().asInstanceOf[Person]