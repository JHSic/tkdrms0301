import java.util.Scanner;

public class toUpperCase
{
	static char charcterChange(char a){
		if(a>= 'A' && a<= 90){
			return a;
		}
		else if(a>= 97 && a<= 122){
			int b = a;
			b = b - 32;
			return (char)b;
		}
		else{
			return '0';
		}
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		char alphabet;
		alphabet=s.next().charAt(0);
		if(alphabet == '0'){
			System.out.print("Not Alaphabet");
		}
		else{
			System.out.print(charcterChange(alphabet));
		}
	}
}