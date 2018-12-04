import java.io.*;
public class Copy{
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader(args[0]);
            out = new FileWriter(args[1]);

            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
        } catch(FileNotFoundException e){
            System.out.println("File Not Exist");
        } catch(IOException e){
            System.out.println("IO Error");
        } finally{
            try{in.close();} catch(IOException e){}
            try{out.close();} catch(IOException e){}
        }
    }
}