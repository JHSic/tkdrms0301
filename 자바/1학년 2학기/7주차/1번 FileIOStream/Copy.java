import java.io.*;
public class Copy{
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream(args[0]);
            out = new FileOutputStream(args[1]);

            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
        } catch(FileNotFoundException e){
            System.out.println("File Not Exist");
        } catch(IOException e){
            System.out.println("IO Error");
        } finally{
            try{if(in != null) in.close();} catch(IOException e){}
            try{if(out != null) out.close();} catch(IOException e){}
        }
    }
}