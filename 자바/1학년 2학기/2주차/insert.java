import java.util.Scanner;

public class insert
{
	public static String Insert(String str1, String str2, int offset){
		String after = "";
		String before = "";
		for(int i = 0; i<str1.length(); i++){
			if(i >= offset) {
			after = after + str1.charAt(i);
			}
			else {
			before = before + str1.charAt(i);
			}
		}
		before = before + str2;
		before = before + after;
		return before;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
		int inputOffset = s.nextInt();
		System.out.print(Insert(input1, input2, inputOffset));
	}
}