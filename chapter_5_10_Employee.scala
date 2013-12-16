
class EmployeeExercise(val name: String, val salary: Double) {
  def this() { this("John Q. Public", 0.0) }
}

// EmployeeExercise ist besser als Employee:
// Weil Primary Constructor in nur einer Zeile beschreibt,
// was Employee in 7 Zeilen macht.
// Trotzdem blöd: hartkodierte Default-Werte

class Employee {
  var name: String
  var salary: Double
  def this(name: String, salary: Double) {
    this()
    this.name = name
    this.salary = salary
  }
}

val employee1 = new EmployeeExercise()
val employee2 = new Employee("John Q. Public", 0.0)

println(employee1.name + " earns " + employee1.salary)
println(employee2.name + " earns " + employee2.salary)