import java.io.*;
public class LineIO {
	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			in = new BufferedReader(new FileReader("in.txt"));
			out = new PrintWriter(new FileWriter("out.txt"));

			String s;
			while ((s = in.readLine()) != null) {
			out.println(s);
			}
		} catch(FileNotFoundException e) {
			System.out.println("File Not Exist");
		} catch(IOException e) {
			System.out.println("IO Error");
		}
		finally { 
			try{ if (in != null) in.close( ); } catch(IOException e){}
			out.close( );
		}
	}
}