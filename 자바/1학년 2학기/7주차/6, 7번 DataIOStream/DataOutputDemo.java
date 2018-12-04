import java.io.*;
public class DataOutputDemo{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(args[0]));
        dos.writeBoolean(true);
        dos.writeLong(100L);
        dos.writeDouble(100.0);
        dos.writeUTF("abc");

        dos.close();
    }
}