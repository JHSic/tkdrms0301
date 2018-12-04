public class Bank{
    public static void main(String[] args) {
        MinusAccount mAcc = new MinusAccount(20000, 1000);

        System.out.println("MinusAccount limitAmount : " + mAcc.getCreditAmount());
        mAcc.withdraw(5000);
        System.out.println("MinusAccount balance : " + mAcc.getBalance());
    }
}