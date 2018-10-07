import java.util.Scanner;
public class Average
{
	public static void main(String[] args)
	{
		int number;
		int count=0;
		int sum=0;
		float average;
		Scanner s=new Scanner(System.in);
		number = s.nextInt();
		if(number > 1){
		for(int i=number; i>0; i=i-1){
			sum = sum + i;
		count++;
		}
		average=sum/count;
		System.out.println(sum);
		System.out.print(average);
		}
		else{
		System.out.println("Enter Number");
		}
	}
}