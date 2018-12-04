import java.io.*;
public class Demo {
	public static void main(String[] args) {
		int[] units = {12, 8, 13, 29, 50};
		DataOutputStream out = new DataOutputStream(new FileOutputStream("fileX"));
		for (int i=0; i<100; i ++) out.writeInt( units[i] );
    }
}