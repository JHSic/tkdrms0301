import java.util.Scanner;

public class subString
{
	static char[] SubString(String str, int start, int end){
		String output = "";
		for(int i = start; i <= end; i++){
			output = output str.charAt(i);
		}
		return output;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String inputString = s.nextLine();
		int inputStart = s.nextInt();
		int inputEnd = s.nextInt();
		System.out.print(SubString(inputString, inputStart, inputEnd));
	}
}