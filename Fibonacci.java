import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int F1=1;
		int F2=1;
		int i=s.nextInt();
		System.out.println(F1);
		System.out.println(F2);
		for(int n=1; n<i-1; n++)
		{
			if(n%2==1)
			{
			F2=F2+F1;
			System.out.println(F2);
			}
			else
			{
			F1=F1+F2;
			System.out.println(F1);
			}
		}
		
	}
}