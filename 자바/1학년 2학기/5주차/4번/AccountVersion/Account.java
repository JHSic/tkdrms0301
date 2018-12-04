abstract class Account {
    private int balance;
    Account(int amount){
        balance = amount;
    }
    public int getBalance(){
        return balance;
    }
    abstract void withdraw(int amount);
    protected void minusBalance(int amount) { balance -= amount; }
}