import java.util.Scanner;

public class While7
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=0;
		int sum=0;
		int average;
		while(s.hasNextInt())
		{
			sum=sum+s.nextInt();
			n=n+1;
		}
	average=sum/n;
	System.out.println(average);
	}
}