import java.util.Scanner;

public class toLowerCase
{
	static char charcterChange(char a){
		if(a>= 65 && a<= 90){
			int b=a;
			b = b+32;
			return (char)b;
		}
		else if(a>= 97 && a<= 122){
			return a;
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