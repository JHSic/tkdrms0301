import java.util.Scanner;
public class If3 
{
	public static void main(String[] args)
	{
		int a, b, max;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 2 integers: ");	
		a = s.nextInt();
		b = s.nextInt();
		if (a>b)
			max = a;
		else
			max = b;
		System.out.println("max of " + a + " and " + b + " is " + max);
	}
}