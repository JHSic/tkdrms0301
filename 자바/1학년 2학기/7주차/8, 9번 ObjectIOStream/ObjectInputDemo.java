import java.io.*;
import java.util.Date;
import java.lang.*;
public class ObjectInputDemo {
   	public static void main(String[] args) throws ClassNotFoundException {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream( new FileInputStream(args[0]) );
			System.out.println( ois.readChar() );		
			System.out.println( ois.readBoolean() );	
			System.out.println( ois.readDouble() );	
			System.out.println( ois.readUTF() );		
			try {
				System.out.println( (Date)ois.readObject() );
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}	
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try{ if(ois != null) ois.close(); } catch(IOException e) {}
		}
   	}
} 