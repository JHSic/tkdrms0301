import java.util.Scanner;

public class NumberPyramid1
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	int Line = s.nextInt();
	int count = 1;
	for(int LineNumber=1; LineNumber<=Line; LineNumber++)
		{
			for(int Spacebar=Line; Spacebar>LineNumber; Spacebar--)
			{
				System.out.print("   ");
			}
			for(int Number=1; Number<=LineNumber*2-1; Number++)
			{
				System.out.printf("%3d",count);
				count++;
			}
			System.out.println();
		}
	}
}