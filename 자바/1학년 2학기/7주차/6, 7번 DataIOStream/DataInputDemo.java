import java.io.*;
public class DataInputDemo {
   public static void main(String[] args) {
		DataInputStream dis = null;
			
		try {
			dis = new DataInputStream( new FileInputStream(args[0]) );
			System.out.println( dis.readBoolean()	 );	
			System.out.println( dis.readLong() 	 );	
			System.out.println( dis.readDouble() 	 );	
			System.out.println( dis.readUTF() 	 );	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { if(dis != null) dis.close(); } catch(IOException e) {}
		}		
   	}
}