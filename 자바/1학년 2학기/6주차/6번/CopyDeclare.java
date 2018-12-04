import java.io.*;
public class CopyDeclare {
   	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileReader in = null;
		FileWriter out = null;
		int c;	
		in = new FileReader("sourceFile");
		out = new FileWriter("targetFile");
		while ((c = in.read()) != -1) {
			out.write(c);
		}
		in.close();
		out.close();
	}
}
