
class Person(name: String) {
  val names = name.split(" ")
  val firstName: String = names(0)
  val lastName: String = names(1)
}

val fred = new Person("Fred Tester")
println(fred.firstName)
println(fred.lastName)
