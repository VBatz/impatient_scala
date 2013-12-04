import java.io.File
import java.util.Scanner

val in = new Scanner(new File("src/main/scala/myfile.txt"))

var countWords = scala.collection.immutable.SortedMap[String, Int]()

while (in.hasNext) {
  val currentWord = in.next()
  if (countWords.contains(currentWord)) {
    val counter = countWords(currentWord)
    countWords += (currentWord -> (counter + 1))
  } else countWords = countWords + (currentWord -> 1)
}

println("\nCount Words of myfile.txt: " + countWords + "\n")
