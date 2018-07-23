import java.util.Scanner;
public class IO4
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = s.nextLine();
		System.out.print("Endter your gender: ");
		boolean truth= s.nextBoolean();
		System.out.println("name is " + name + "and age is " + "("+ truth +").");
	}
}