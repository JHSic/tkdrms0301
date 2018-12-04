public class Catch{
    public static void main(String[] args) {
        int a = 10, b = 0, x;
        try {
            x = a/b;
            System.out.println(x);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}