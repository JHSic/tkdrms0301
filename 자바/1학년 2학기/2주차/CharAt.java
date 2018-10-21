import java.util.Scanner;
import java.io.IOException;

public class CharAt
{
	static char CHarAt(String str, int index){
		char a = str.charAt(index);
		return a;
	}
	public static void main(String[] args) throws IOException{
		Scanner kbd=new Scanner(System.in);
		String inputString = kbd.nextLine();
		int inputNumber = kbd.nextInt();
		System.out.print(CHarAt(inputString, inputNumber));
	}
}