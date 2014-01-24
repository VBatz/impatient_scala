
import java.lang.System.getProperty

val userName = getProperty("user.name")
val passWord = readLine()

if (passWord == "secret") {
  System.err.println("no secret password offered") // schreibt auf standard error stream
} else System.out.println("Welcome, " + userName) // schreibt auf standard output stream, so wie "println" im Allgemeinen

println(userName)