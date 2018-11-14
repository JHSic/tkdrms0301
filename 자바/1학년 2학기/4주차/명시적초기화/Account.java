public class Account {
	static { System.out.println("static initialize block"); }
	{ System.out.println("static initialize block"); }

	private long balance;
	private String owner;
	Account(String owner, long amount) {
		System.out.println("Constructor");
		this.owner = owner;
		balance = amount;
	}
}