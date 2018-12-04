import java.io.*;
public class Delete {
    public static void main(String... args) {
      try {
            File f = new File(args[0]);
  
            if ( !f.exists() ) 
              throw new IllegalArgumentException("Not File: " + args[0]);
             if ( !f.canWrite() )
              throw new IllegalArgumentException("Prohibit Wirte: " + args[0]);
             if ( f.isDirectory() && f.list().length>0 ) 
              throw new IllegalArgumentException("Not Empty Directory: " + args[0]);
             if ( !f.delete() )
              throw new IllegalArgumentException("Delete Fail");
      } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
      }
    }
  }