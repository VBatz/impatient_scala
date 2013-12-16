
class Person(var age: Int = 0) {
  if (age < 0) age = 0
}

val fred = new Person(78)