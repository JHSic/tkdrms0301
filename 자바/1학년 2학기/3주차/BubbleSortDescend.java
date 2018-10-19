import java.util.Random;

public class BubbleSortDescend {

	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[10];

		System.out.println("Before Sort");
		for(int i=array.length-1; i>=0; i--){
			array[i] = random.nextInt(100);
			System.out.println(array[i]);
		}
		
		System.out.println("After Sort");
		for(int j=array.length-1; j>=0; j--){
			for(int i=array.length-1; i>=0; i--){
				if (array[j] > array[i]) {	
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
				
			}
		}
		for(int i=array.length-1; i>=0; i--){
			System.out.println(array[i]);
		}
	}
}
