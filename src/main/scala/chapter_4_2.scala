import java.io.File
import java.util.Scanner

val in = new Scanner(new File("src/main/scala/myfile.txt"))

val countWords = scala.collection.mutable.HashMap[String, Int]()

while (in.hasNext) {
  val currentWord = in.next()
  if (countWords.contains(currentWord)) countWords(currentWord) += 1 else countWords(currentWord) = 1
}

println("\nCount Words of myfile.txt: " + countWords + "\n")