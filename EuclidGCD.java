import java.util.Scanner;
public class EuclidGCD
{
   public static void main(String[] args)
	{
		int a, b, gcd;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 2 integers: ");
		a = s.nextInt();
		b = s.nextInt();
		gcd = findGCD(a, b);
		System.out.println(gcd);
	}
	static int findGCD(int a,int b)
	{
		while(b != 0)
		{
			if(a>b)
			a= a-b;
			else
			b= b-a;
		}
		return a;
	}
}