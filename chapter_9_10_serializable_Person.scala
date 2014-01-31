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
val june = new Person("June")

fred.getFriends(john)

john.getFriends(fred)
john.getFriends(june)

june.getFriends(john)
june.getFriends(jane)

john.currentFriends

val allMyPersons = Array[Person](john, fred, jane, june)

import java.io._

//val out = new ObjectOutputStream(new FileOutputStream("chapter_9_10.obj"))
//out.writeObject(fred)
//out.close()

//val in = new ObjectInputStream(new FileInputStream("chapter_9_10.obj"))
//val savedFred = in.readObject().asInstanceOf[Person]