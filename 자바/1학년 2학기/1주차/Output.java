import java.util.Scanner;
public class Output
{
	public static void main(String[] args)
	{
		int sum = 0;
		int n = 0;
		float average;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int a;
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt())
		{
			a = s.nextInt();
			sum = sum + a;
			n=n+1;
			max = maxOfTwo(max,a);
			min = minOfTwo(min,a);
		}
		average = sum/n;
		System.out.println(sum);
		System.out.println(average);
		System.out.println(max);
		System.out.println(min);
	}
	static int maxOfTwo(int a, int b){
		int max;
		if(a>b)
			max=a;
		else
			max=b;
		return max;
	}
	static int minOfTwo(int c, int d){
		int min;
		if(c<d)
			min=c;
		else
			min=d;
		return min;
	}
}