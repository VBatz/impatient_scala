
import java.io.File

def isScalaSourceFile(child: File): Boolean = {
  child.getName.matches("""[a-z0-9_]+.scala""")
}

def findFiles(dir: File) {
  for (child <- dir.listFiles) {
    if (child.isFile) {
      if (isScalaSourceFile(child)) {
        println(child.getAbsolutePath)
      }
    } else {
      findFiles(child)
    }
  }
}

findFiles(new File("."))