import java.util.Scanner;
public class IO2
{
	public static void main(String[] args)
	{
		String name;
		float age;
		Scanner s=new Scanner(System.in);
		System.out.print("enter your name: ");
		name = s.nextLine();
		System.out.print("enter your age: ");
		age = s.nextFloat();
		System.out.println("name is " + name + "and age is " + age + ".");
	}
}