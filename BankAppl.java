import java.util.Scanner;
public class BankAppl {
	public static void main(String[] args, Bank bank) {
		Bank bank = new Bank();
		bank.run();
	}
}

class Bank {
	private Screen scr;
	private Keyboard kbd;
	private Account acc1, acc2;

	public Bank() {
		scr = new Screen();
		kbd = new Keyboard();

		acc1 = new Account("ȫ�浿", 10000);
		acc2 = new Account("ȫ�Ǽ�", 50000);
	}
	// main control
	public void run() { 
		while (true) {

			char command = getCommand();
			if (command == '6') 
				break;

			switch (command) {
				case '1' : new InquiryControl().execute(acc1, scr); 		break;
				case '2' : new DepositControl().execute(acc1, scr, kbd); 	break;
				case '3' : new WithdrawControl().execute(acc1, scr, kbd); 	break;
			  //	case '4' : new TransferControl().execute(acc1, acc2, scr, kbd); break;
			  //	case '5' : new OpenControl().execute(scr, kbd); 		break;
				default : break;
			}
		}
		System.out.println("Terminated...");
}
private char getCommand() { // helper method
		// display menu
		System.out.println("\n\n\t\tM e n u");
		System.out.println("\t\t\t (1) Balance Inquiry");
		System.out.println("\t\t\t (2) Deposit");
		System.out.println("\t\t\t (3) Withdraw");
		System.out.println("\t\t\t (4) Account Transfer");
		System.out.println("\t\t\t (5) Account Opening");
		System.out.println("\t\t\t (6) Terminate");

		// get user selection
		scr.displayPrompt("\n\t\t��ȣ�� �Է��Ͻÿ�: ");
		return kbd.getSelection();
	}
} // end of class Bank


// Boundary Classes
class Keyboard {
	private Scanner kbd = new Scanner(System.in);

	char		getSelection() 	{ return kbd.next().charAt(0); }
	int 		getAmount() 		{ return kbd.nextInt(); }
	String 	getName() 		{ return kbd.next(); }
}

class Screen {
	void displayMessage(String m) { System.out.println(m); }
	void displayPrompt(String m) { System.out.print(m); }
}

// Entity Classes
class Account {
   	private static int lastNumber=0;

	private int number;
	private int balance; 
	private String owner;

   	Account(String name, int amount) {
		number = nextAccountNumber();
		owner = name;
		balance = amount;
   	}

	private static int nextAccountNumber() {  
		return ++lastNumber; 
	}
	public int getBalance() { 
		return balance; 
	}

   	public void deposit(int amount) { 
		balance += amount; 
	}

   	public boolean withdraw(long amount) {
		if (amount <= balance) {
			balance-=amount;
			return true;
		} else {
			return false;
		}
	}
}

// control Classes
class WithdrawControl {
	public void execute(Account acc, Screen scr, Keyboard kbd) {

		scr.displayPrompt("����� �ݾ��� �Է��Ͻÿ�: ");
		int amount = kbd.getAmount();

		if (acc.withdraw(amount))
			scr.displayMessage("�ܰ� " + acc.getBalance() + " �Դϴ�.");
		else
			scr.displayMessage("�ܰ� �����մϴ�.");
	}
}

class DepositControl {
	public void execute(Account acc, Screen scr, Keyboard kbd) {

		scr.displayPrompt("�Ա��� �ݾ��� �Է��Ͻÿ�: ");
		int amount = kbd.getAmount();

		acc.deposit(amount);
		scr.displayMessage("�ܰ� " + acc.getBalance() + " �Դϴ�.");
	}
}



class InquiryControl {
	public void execute(Account acc, Screen scr) {
		scr.displayMessage("�ܰ� " + acc.getBalance() + " �Դϴ�.");
	}
}