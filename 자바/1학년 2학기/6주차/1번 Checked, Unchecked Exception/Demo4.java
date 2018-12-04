import java.io.*;
public class Demo4 {
	public static void main(String[] args) {
		int[] units = {12, 8, 13, 29, 50};
		DataOutputStream out = null;
		try{
			out = new DataOutputStream(new FileOutputStream("fileX"));
			for (int i=0; i<units.length; i ++) out.writeInt( units[i] );
		}
		catch (FileNotFoundException e){
			System.out.print("File Not Exist");
        }
        catch (IOException e){
            System.out.print("Not Write File");
        }
	}
}