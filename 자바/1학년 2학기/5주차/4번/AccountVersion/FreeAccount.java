class FreeAccount extends Account {
    FreeAccount(int amount) {
        super(amount);
    }
    public void withdraw(int amount) {
        if(getBalance() >= amount)
            minusBalance(amount);
        else
            System.out.println("you can't withdraw");
	}
}
 