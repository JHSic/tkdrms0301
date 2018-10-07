import java.util.Scanner;

public class CompareTo
{
	static int CompareTo(String str1, String str2){
		if(str1.length() < str2.length()) {
			for(int i = 0; i < str1.length(); i++) {	
				if(str1.charAt(i) > str2.charAt(i)) { return -1; }
				else if(str1.charAt(i) < str2.charAt(i)) { return 1; }
			}
			return 1;
		}
		else if(str1.length() ==  str2.length()) {
			for(int i = 0; i < str1.length(); i++) {	
				if(str1.charAt(i) > str2.charAt(i)) { return -1; }
				else if(str1.charAt(i) < str2.charAt(i)) { return 1; }
			}
			return 0;
		}
		else {
			for(int i = 0; i < str2.length(); i++) {	
				if(str1.charAt(i) > str2.charAt(i)) { return -1; }
				else if(str1.charAt(i) < str2.charAt(i)) { return 1; }
			}
			return -1;
		}
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String input1, input2;
		input1 = s.nextLine();
		input2 = s.nextLine();
		System.out.print(CompareTo(input1, input2));
	}
}