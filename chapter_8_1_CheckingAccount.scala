
class BankAccount(initialBalance: Double) {

  private var balance = initialBalance

  def currentBalance = balance

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }
}

class CheckingAccount(charge: Double, initB: Double) extends BankAccount(initB) {

  override def deposit(amount: Double) = {
    super.deposit(amount - charge)
  }

  override def withdraw(amount: Double) = {
    super.withdraw(amount + charge)
  }
}

println("New BankAccount")
val giro = new BankAccount(200)
println(giro.currentBalance)
println(giro.deposit(100.00))
println(giro.withdraw(50.00))

println("New CheckingAccount")
val spar = new CheckingAccount(1.5, 200)
println(spar.currentBalance)
println(spar.deposit(100.00))
println(spar.withdraw(50.00))