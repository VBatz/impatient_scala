
import java.io.File

def subdirs(dir: File): Iterator[File] = {
  val children = dir.listFiles.filter(_.isDirectory)
  children.toIterator ++ children.toIterator.flatMap(subdirs _)
}

for (d <- subdirs("impatient_scala")) {
  if (d.matches("""[a-z0-9_]+.scala""")) println(d)
}