import java.util.Scanner;

public class For5
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int stage=s.nextInt();
		for(int i=10;i>0; i--)
		{
			System.out.println(stage + "*" + i+"="+stage*1);
		}
	}
}