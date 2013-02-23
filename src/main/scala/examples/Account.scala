package examples

class NegativeDeposit() extends RuntimeException
class NotEnoughMoney() extends RuntimeException

class Account(name : String, var balance: Int) {
	assert(balance >= 0, "positive initial balance, please")
	
	def withdraw(amount: Int) =	{
		if (amount > balance) throw new NotEnoughMoney()
		balance -= amount
	}
	
	def deposit(amount : Int) = {
		if (amount < 0) throw new NegativeDeposit()
		balance += amount 
	}
}