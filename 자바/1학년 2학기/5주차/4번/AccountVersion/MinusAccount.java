class MinusAccount extends Account {
    private int limitAmount;
  
    public MinusAccount(int limitAmount, int amount) {
          super(amount);
          this.limitAmount = limitAmount;
    }
    public int getCreditAmount() { 
      return limitAmount; 
    }

    public void withdraw(int amount) {
        if ((getBalance() + limitAmount) >= amount)
            minusBalance(amount);
        else
            System.out.println("you can't withdraw");
    }
}