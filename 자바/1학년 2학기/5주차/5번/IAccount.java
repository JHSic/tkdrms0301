public interface IAccount{
    public int getAccountNumber();
    public int getBalance();
    public void deposit(int amount);
    public void withdraw(int amount);
    
    public void showAccount();
}