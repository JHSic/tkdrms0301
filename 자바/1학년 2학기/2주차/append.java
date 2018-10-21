import java.util.Scanner;

class append
{
	static String Append(String str1, String str2){
		String output = str1;
		for(int i = 0; i<str2.length(); i++){
			output = output + str2.charAt(i);
		}
		return output;
	}
	public static void main(String[ ] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
		System.out.print(Append(input1, input2));
	}
}