import java.io.*;
import java.util.Date;

public class ObjectIO {
	public static void main(String[] args) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("time.dat"));
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("time.dat"));
	 
			out.writeInt(Integer.parseInt(args[0]));
			out.writeObject(args[1]);
			out.writeObject(new Date());
			out.flush();
			out.close();

			System.out.println(in.readInt());
			System.out.println((String)in.readObject());
			System.out.println((Date)in.readObject());
			in.close();
		} catch (Exception e) {
			System.out.println("use java ObjectIO Integer String");
		}
	}
}