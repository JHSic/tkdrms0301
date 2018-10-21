import java.util.Scanner;

public class IO1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		
		if (a<=100 && a>=90)
			System.out.print("A");
		else if (a<=89 && a>=80)
			System.out.print("B");
		else if (a<=79 && a>=70)
			System.out.print("C");
		else if (a<=69 && a>=60)
			System.out.print("D");
		else
			System.out.print("F");

	}
}//end of IO1