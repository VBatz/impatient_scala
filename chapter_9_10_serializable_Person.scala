import scala.collection.mutable.ArrayBuffer

class Person extends Serializable {
  private val friends = new ArrayBuffer[Person]
}

val fred = new Person()
val john = new Person()
val jane = new Person()
val june = new Person()
import java.io._

val out = new ObjectOutputStream(new FileOutputStream("chapter_9_10.obj"))
out.writeObject(fred)
out.close()

val in = new ObjectInputStream(new FileInputStream("chapter_9_10.obj"))
val savedFred = in.readObject().asInstanceOf[Person]
