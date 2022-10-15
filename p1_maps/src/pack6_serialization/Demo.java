package pack6_serialization;

import java.io.File;
import java.io.IOException;

public class Demo {
    
    public static void main(String[] args)  {
        
       File f = new File("C:\\vacant2\\a.txt");
       
//       System.out.println(f);
//       
       System.out.println(f.exists());
//       
//       try {
//        f.createNewFile();
//    } catch (IOException e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//    }
//       
//       System.out.println(f.exists());
       
      
        try {
            f.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("done");
        System.out.println(f.exists());
        
        
    }

}
