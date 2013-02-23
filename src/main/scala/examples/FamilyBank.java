package examples;

/**
 * Simple "Bank" made in Java with two Accounts implemented in Scala.
 * Tests are in Scala
 */
public class FamilyBank {
	private final Account spendingAccount;
	private final Account savingsAccount;
	
	public FamilyBank(int money) {
		this.spendingAccount = new Account("spending account", money);
		this.savingsAccount = new Account("savings account", 0);
	}

	/** put money to spending account */
	public int deposit(int money) {
		spendingAccount.deposit(money);
		return money();
	}
	
	/** move money from spending account to savings account */
	public void save(int money) {
		spendingAccount.withdraw(money);
		savingsAccount.deposit(money);
	}
	
	/** total amount of money, spending + savings */
	public int money() {
		return spendingAccount.balance() + savingsAccount.balance();
	}
}
