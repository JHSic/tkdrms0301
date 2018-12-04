import java.io.*;
import java.util.Scanner;
public class ScannerDoubleReader {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new FileReader("b.dat"));
		float sum = 0;
		while (s.hasNext()) {
			if(s.hasNextDouble()) sum += s.nextDouble();
			else s.next();
		}
		System.out.println(sum);
		s.close();
	}
}
