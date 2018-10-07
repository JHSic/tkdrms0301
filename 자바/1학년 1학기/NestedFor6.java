import java.util.Scanner;

public class NestedFor6
{
	public static void main(String[] args)
	{
	for(int i=2; i<10; i=i+1)
		{
		for(int j=1; j<10; j=j+1)
			System.out.printf("%5d", i*j);
			System.out.println();
		}
		System.out.println();
	}
}