public class Account {
	private static int lastAccountNumber = 0;
	private int accountNumber, balance;
	
	Account(int amount) {
		accountNumber = nextAccountNumber();
		balance = amount;
	}
	public int getAccountNumber(){ return accountNumber; }
	public int getBalance() { return balance; }
	public void deposit(int amount) { plusBalance(amount); }
	public void withdraw(int amount) {
		if(balance <= amount) minusBalance(amount);
	}

	protected void minusBalance(int amount) { balance -= amount; }
	protected void plusBalance(int amount) { balance += amount; }
	protected static int nextAccountNumber() { return ++lastAccountNumber; }
}

