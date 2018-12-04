import java.io.*;
import java.util.Date;
public class ObjectOutputDemo {
   	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream( new FileOutputStream(args[0]) );
			oos.writeChar('1');
			oos.writeBoolean(true);
			oos.writeDouble(100.0);
			oos.writeUTF("abc");
			oos.writeObject( new Date() ); 
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try{ if(oos != null) oos.close(); } catch(IOException e) {}
		}
   	}
}