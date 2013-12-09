
class Employee {
  var name: String
  var salary: Double
  def this(name: String, salary: Double) {
    this()
    this.name = name
    this.salary = salary
  }
}

val employee = new Employee()