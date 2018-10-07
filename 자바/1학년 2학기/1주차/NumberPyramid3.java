import java.util.Scanner;

public class NumberPyramid3
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	int Line = s.nextInt();
	for(int LineNumber=1; LineNumber<=Line; LineNumber++)
		{
		for(int Spacebar=Line; Spacebar>LineNumber; Spacebar--)
		{
			System.out.print(" ");
		}
		for(int LeftNumber=LineNumber; LeftNumber>=1; LeftNumber--)
		{
			System.out.print(LeftNumber);
		}
		for(int RightNumber=2; RightNumber<LineNumber+1; RightNumber++)
		{
			System.out.print(RightNumber);
		}
		System.out.println();
		}
	}
}