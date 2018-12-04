public abstract class Account implements IAccount{
    private static int lastAccountNumber = 0;
    private int accountNumber;
    private int balance;

    public Account(int amount){
        accountNumber = nextAccountNumber();
        balance = amount;
    }

    public int getAccountNumber() { return accountNumber; }
    public int getBalance() { return balance; }
    public abstract void deposit(int amount);
    public abstract void withdraw(int amount);

    protected void minusBalance(int amount) { balance -= amount; }
    protected void plusBalance(int amount) { balance += amount; }
    protected static int nextAccountNumber() { return ++lastAccountNumber; }

    public void showAccount(){
        System.out.printf("%04d-%04d %10d%n", accountNumber/1000, accountNumber%1000, balance);
    }
}