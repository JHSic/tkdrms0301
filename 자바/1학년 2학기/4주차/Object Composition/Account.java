public class Account {
	private long balance;
	private Owner owner;
	
	public Account(long amount, Owner owner) {
		this.owner = owner;
		balance = amount;
	}
	public Owner getOwner(){ return owner; }
	public long getBalance(){ return balance; }
}