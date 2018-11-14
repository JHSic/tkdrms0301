public class Summation
{
	public static void main(String... args){ //가변수인수 사용법
		int[] a = new int[10];
		for(int i=0; i<a.length; i++){
			a[i] = i;
		}
		System.out.println(summation(a));
	}

	public static int summation(int... a){
		int total = 0;
		for(int i=1; i<a.length; i++){
			total += a[i];
		}
		return total;
	}
}