import java.util.Scanner;
import java.io.*;
public class ScannerIO {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new FileReader("a.dat"));
		while (s.hasNextFloat()) {
			System.out.println(s.nextFloat());
		}
		s.close();
	}
}
