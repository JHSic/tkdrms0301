import java.util.Scanner;

public class replace
{
	public static String Replace(String s, String str, int offset){
		String result = "";
		for(int i = 0; i<offset; i++)
			result = result + s.charAt(i);
		for(int i = 0; i<str.length(); i++)
			result = result + str.charAt(i);
		return result;
    	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
		int inputOffset = s.nextInt();
		System.out.print(Replace(input1, input2, inputOffset));
	}
}