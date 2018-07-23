import java.util.Scanner;
public class IO5
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=s.nextLine();
		System.out.print("Enter your age: ");
		int age = s.nextInt();
		System.out.print("Enter your gender: ");
		char gender = s.next().charAt(0);
		System.out.print("Enter truth: ");
		boolean truth=s.nextBoolean();

		System.out.println(name + "(" + gender +")" + age + "(This statement is " + truth + ")");
	}
}