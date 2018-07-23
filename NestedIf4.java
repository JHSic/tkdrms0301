import java.util.Scanner;
public class NestedIf4
{
	public static void main(String[] args)
		{
		Scanner s=new Scanner(System.in);
		System.out.print("성별(m/f) 나이 : ");
		char gender = s.next().charAt(0);
		int age=s.nextInt();

		if(gender=='f')
			if (age>20)
			System.out.println("여자 성인");
			else
			System.out.println("여자 미성년자");
		else
			if(age>20)
			System.out.println("남자 성인");
			else
			System.out.println("남자 미성년자");
		}
}