import java.util.Scanner;

public class StarPyramid1
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	int Line = s.nextInt();
	for(int LineNumber=1; LineNumber<=Line; LineNumber++)
		{
			for(int Star=1; Star<=LineNumber; Star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}