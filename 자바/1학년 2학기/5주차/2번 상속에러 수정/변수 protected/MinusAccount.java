public class MinusAccount extends Account {
    private int limitAmount;
  
    public MinusAccount(int limitAmount, int amount) {
          super(amount);
          this.limitAmount = limitAmount;
    }
    public int getCreditAmount() { 
      return limitAmount; 
    }
  
    public void withdraw(int amount) {
      if ((balance + limitAmount) >= amount) balance -= amount;
    }
  }