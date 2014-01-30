
import java.io.File

def isScalaSourceFile(child: File): Boolean = {
  child.getName.matches( """[a-z0-9_]+.scala""")
}

def foo(dir: File) {
  val contents = dir.listFiles

  if(contents != null) {
    contents.filter(f => f.isFile && isScalaSourceFile(f)).foreach(f => println(f.getAbsolutePath))
    contents.filter(_.isDirectory).foreach(foo)
  }
}

foo(new File(".."))