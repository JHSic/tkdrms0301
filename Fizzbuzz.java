import java.util.Scanner;

public class Fizzbuzz
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int i;
		int value=s.nextInt();
		for(i=1; i<value; i++)
		{
			if(i%5==0)
				{
				if(i%7==0)
					System.out.println("fizzbuzz");
				else
					System.out.println("fizz");
				}
			else if(i%7==0)
				{
				if(i%5==0)
					System.out.println("fizzbuzz");
				else
					System.out.println("buzz");
				}
			else
				System.out.println(i);
		}
	}
}