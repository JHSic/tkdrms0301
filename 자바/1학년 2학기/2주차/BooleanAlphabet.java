import java.util.Scanner;

public class BooleanAlphabet
{
	static boolean booleanAlphabet(char a){
		if(a>=65 && a<=122){
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