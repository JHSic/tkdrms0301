import java.io.*;
public class CopyCatch {
   	public static void main(String[] args) {
		FileReader in = null;
		FileWriter out = null;
		int c;
		try{
			in = new FileReader("sourceFile");
			out = new FileWriter("targetFile");
			while ((c = in.read()) != -1) {
			out.write(c);	
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Exist");
		}
		catch(IOException e){
			System.out.println("Not Write File");
		}
		finally{
			try {if (out != null) out.close();} catch (IOException e) {}
			try {if (in != null) in.close();} catch (IOException e) {}
		}
   	}
}