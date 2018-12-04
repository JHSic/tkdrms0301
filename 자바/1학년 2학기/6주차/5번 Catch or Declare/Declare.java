public class Declare{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int x;
        System.out.println(divide(a,b));    
    }
    public static int divide(int a, int b) throws ArithmeticException {
	    return a/b;
    }  
}