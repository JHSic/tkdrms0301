public class Poly {
    public static void main(String[] args) {
        Account acc1 = new FreeAccount(1000);
        Account acc2 = new MinusAccount(20000,1000);
  
        acc1.withdraw(5000);
        acc2.withdraw(5000);
        System.out.println("your balance : " + acc1.getBalance());
        System.out.println("your balance : " + acc2.getBalance());
    }
}