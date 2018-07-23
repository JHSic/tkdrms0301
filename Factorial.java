import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int value=n;
		if(n>0)
			{
				for(int i=1; value-i>0; i++)
				{
					n=n*(value-i);
				}
				System.out.print(value +"! = " +n);
			}
		else if(n==0)
			System.out.print(n+"!=1");
		else
			System.out.print("잘못입력하셨습니다.");
	}
}