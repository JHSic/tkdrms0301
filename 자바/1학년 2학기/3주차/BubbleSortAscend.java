import java.util.Random;

public class BubbleSortAscend {

	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[10];

		System.out.println("Before Sort");
		for(int i=0; i<array.length; i++){
			array[i] = random.nextInt(100);
			System.out.println(array[i]);
		}
		
		System.out.println("After Sort");
		for(int j=0; j<array.length; j++){
			for(int i=0; i<array.length; i++){
				if (array[j] < array[i]) {	
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
				
			}
		}
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
}
