public class Bank {
	public static void main(String[] args) {
		Owner o = new Owner("tkdrms");
		Account a = new Account(100, o);
		System.out.println(a.getBalance());
		System.out.println(a.getOwner().getName());
	}
}