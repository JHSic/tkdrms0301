import java.util.Scanner;

public class charcterMethod
{
	static int compare(char a, char b){
		if(a > b){
			return 1;
		}
		else if(a == b){
			return 0;
		}
		else{
			return -1;
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		char c1, c2;
		c1=s.next().charAt(0);
		c2=s.next().charAt(0);
		System.out.print(compare(c1, c2));
	}
}