import java.util.Scanner;

public class BooleanNumber
{
	static boolean booleanAlphabet(char a){
		if(a>=48 && a<=57){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		char alphabet;
		alphabet=s.next().charAt(0);
		System.out.print(booleanAlphabet(alphabet));
	}
}