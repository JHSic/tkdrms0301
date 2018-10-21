import java.util.Scanner;

public class StringLength
{
	static int stringLength(String str){
		str = str + '\0';
		int count = 0;
		
		for (int i = 0; str.charAt(i) != '\0'; i++){
			count++;
		}
		return count;
	}
	public static void main(String[] args){
		Scanner kbd=new Scanner(System.in);
		String inputString = kbd.nextLine();
		System.out.print(stringLength(inputString));
	}
}