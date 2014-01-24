
import java.util.{ HashMap => JavaHashMap }

val javaMap = new JavaHashMap[String, String]()
javaMap.put("firstname", "Jane")
javaMap.put("lastname", "Doe")
javaMap.put("brother", "John")



def convertJavaHashMapToScalaHashMap(map: JavaHashMap[String, String]) = {
  import scala.collection.mutable.{ HashMap => ScalaHashMap }

  val newScalaMap = new ScalaHashMap[String, String]()
  val it = map.entrySet().iterator()
  while(it.hasNext()) {
    val entry = it.next()
    newScalaMap(entry.getKey) = entry.getValue
  }
  newScalaMap
}

val scalaMap = convertJavaHashMapToScalaHashMap(javaMap)

println(scalaMap)