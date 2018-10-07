import java.util.Scanner;

public class ToString
{
	static String toString(int a){
		String result = "";
		int length = (int)Math.log10(a) + 1;
		for(int i = 0; i <length; i++){
			result = (char)((a % 10) + '0') + result;
			a /= 10;
		}
		return result;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int input;
		input = s.nextInt();
		System.out.print(toString(input));
	}
}