public class NormalAccount extends Account {
    public NormalAccount(int amount) {
        super(amount); 
    }
    public void deposit(int amount) { plusBalance(amount); }
    public void withdraw(int amount) {
        if (getBalance() >= amount) minusBalance(amount); 
    }
}