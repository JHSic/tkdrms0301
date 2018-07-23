import java.util.Scanner;

public class For4
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int stage=s.nextInt();
	for(int i=1; i<10; i++)
	{
	System.out.println(i+"*"+stage+"="+stage*i);
	}
	}
}