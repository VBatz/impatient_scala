
class BankAccount {
  private var amount = 0
  def deposit(newValue: Int) = { amount += newValue }
  def withdraw(newValue: Int) = {
    if ( newValue < amount ) amount -= newValue
    else throw new IllegalArgumentException("Not enough money on your BankAccount")
  }
  def balance = amount
}

val giro = new BankAccount
giro.deposit(700)
giro.withdraw(30)
println(giro.balance)