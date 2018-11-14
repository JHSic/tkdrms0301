class Account implements Cloneable{
	private long balance;
	private String owner;
	
	Account(String owner, long amount) {
		this.owner = owner;
		balance = amount;
    }
    public long getBalance(){ return balance; }

    protected Object Clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class AccountClone {
    public static void main(String[] args) {
        Account acc1 = new Account("tkdrms", 1000);

       try{ 
           Account acc2 = (Account)acc1.Clone();
           
           System.out.println(acc1);
           System.out.println(acc2);
           System.out.println(acc1.getBalance());
           System.out.println(acc2.getBalance());
       }
       catch(CloneNotSupportedException e){
           e.printStackTrace();
       }
    }
}