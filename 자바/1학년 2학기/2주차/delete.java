import java.util.Scanner;

public class delete
{
	public static String delete(String str, int start, int end){
		String result = "";
		for(int i = 0; i<start; i++)
			result = result + str.charAt(i);
		for(int i = start; i<end; i++)
			result = result + str.charAt(i);
		return result;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String input = s.next();
		int inputStart = s.nextInt();
		int inputEnd = s.nextInt();
		System.out.print(delete(input, inputStart, inputEnd));
	}
}