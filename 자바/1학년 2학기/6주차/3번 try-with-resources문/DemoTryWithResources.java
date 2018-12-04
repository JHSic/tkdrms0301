import java.io.*;
import java.lang.AutoCloseable;
public class DemoTryWithResources {
    public static void main(String[] args) {
        int[] units = {12, 8, 13, 29, 50};
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream("aFile"))){
            for (int i=0; i<units.length; i ++) out.writeInt(units[i]);
        } catch (FileNotFoundException e) { 
            System.out.println("File Not Exist");
        } catch (IOException e) {
            System.out.println("Not Write File");
        }
    }
    public class TestMe implements AutoCloseable{
        public void close() throws Exception{
            System.out.println("From Close");
        }
    }
}
