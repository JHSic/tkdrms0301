public class Account {
	private static long lastAccountNumber=0L;

	private long accountNumber, balance; 
	private String owner;
	
	Account(String owner, long amount) {
		accountNumber = nextAccountNumber();
		this.owner = owner;
		balance = amount;
	}

	private static long nextAccountNumber() { return ++lastAccountNumber; }
	public String setOwner(String owner) {
		this.owner = owner;
		return owner;
	}
	public long getBalance() { return balance; }
	public long setBalance(long balance){
		this.balance = balance;
		return balance;
	}
	public void deposit(long amount) { balance += amount; }
	public long withdraw(long amount) {return balance >= amount ? balance -= amount : 0L;}

	public void showAccount()	{
		System.out.printf("%s %04d-%04d %10d%n", owner, accountNumber/1000, accountNumber%1000, balance);
	}
}