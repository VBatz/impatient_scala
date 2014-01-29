
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

class SavingsAccount(initB: Double, charge: Double) extends BankAccount(initB) {

  private var countTransactions: Int = 0

  def earnMonthlyInterest(interest: Double) = {
    countTransactions = 0
    super.deposit(super.currentBalance * interest)
  }

  override def deposit(amount: Double) = {
    countTransactions += 1
    if (countTransactions > 3) {
      super.deposit(amount - charge)
    } else {
      super.deposit(amount)
    }
  }

  override def withdraw(amount: Double) = {
    countTransactions += 1
    if (countTransactions > 3) {
      super.withdraw(amount + charge)
    } else {
      super.withdraw(amount)
    }
  }
}

println("New BankAccount")
val giro = new BankAccount(200)
println(giro.currentBalance)
println(giro.deposit(100.00))
println(giro.withdraw(50.00))

println("New SavingsAccount")
val spar = new SavingsAccount(200, 2.0)
println(spar.currentBalance)
println(spar.deposit(100.00))
println(spar.deposit(100.00))
println(spar.deposit(100.00))
println(spar.deposit(100.00))
println(spar.withdraw(50.00))
println(spar.earnMonthlyInterest(0.05))
