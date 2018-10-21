import java.util.Scanner;

public class Bank {
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		Account acc = new Account("",0);
				while(true) {
					System.out.println("(1) createAccount :");
					System.out.println("(2) inquiryBalance :");
					System.out.println("(3) deposit :");
					System.out.println("(4) withdraw :");
					System.out.println("(5) exit :");
					char number = s.next().charAt(0);
					if(number == '1') {
						createAccount(acc);
					}
					else if(number == '2') {
						InquiryBalance(acc);
					}
					else if(number == '3') {
						Deposit(acc);
					}
					else if(number == '4') {
						Withdraw(acc);
					}
					else if(number == '5'){
						System.out.println("exit");
						break;
					}
					if(number == '5')
						break;
				}
	}
	 
	public static void createAccount(Account acc) {
		System.out.print("Enter Owner :");
		acc.setOwner(s.next());
		System.out.print("Enter Balance :");
		acc.setBalance(s.nextLong());
		acc.showAccount();
	}
	public static void InquiryBalance(Account acc) {
		System.out.print("Inquiry Balance :");
		acc.getBalance();
	}
	public static void Deposit(Account acc) {
		System.out.print("Enter deposit :");
		acc.deposit(s.nextLong());
		acc.showAccount();
	}
	public static void Withdraw(Account acc) {
		System.out.print("Enter widraw :");
		acc.withdraw(s.nextLong());
		acc.showAccount();
	}
}