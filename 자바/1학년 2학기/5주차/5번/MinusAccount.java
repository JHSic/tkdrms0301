public class MinusAccount extends Account {
	private int creditLimitAmount;
   	public MinusAccount(int amount, int limitAmount) {
	 	super(amount);
		creditLimitAmount = limitAmount;
   	}
   	public void deposit(int amount) { plusBalance(amount); }
   	public void withdraw(int amount) {
		if ((getBalance() + creditLimitAmount) >= amount) minusBalance(amount);
	}
} 