public class Operation {
    public static int mX() {
	    int x = 5;
        try {
		System.out.println("main algorithm for x");
	} catch (Exception e) {
		System.out.println("alternative algorithm for x");
	}
    return x;
    }
    public static void main(String[] args) {
        System.out.println(mX());
    }
}