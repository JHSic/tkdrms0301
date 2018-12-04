public class Bank { 
    public static void main(String[] args) {
        IAccount tkdrms = new NormalAccount(1000);
        tkdrms.showAccount();
  
        tkdrms.deposit(10000); System.out.print("deposit 10000: "); tkdrms.showAccount();
        tkdrms.withdraw(5000); System.out.print("withdraw  5000: "); tkdrms.showAccount();
        tkdrms.withdraw(9000); System.out.print("withdraw  9000: "); tkdrms.showAccount();
        System.out.println();

        IAccount tkdrms2 = new MinusAccount(2000, 50000);
        tkdrms2.showAccount();
  
        tkdrms2.deposit(20000); System.out.print("deposit 20000: "); tkdrms2.showAccount();
        tkdrms2.withdraw(7000); System.out.print("withdraw  7000: "); tkdrms2.showAccount();
        tkdrms2.withdraw(50000); System.out.print("withdraw  50000: "); tkdrms2.showAccount();
        System.out.println();
    }
}