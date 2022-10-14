package pack5;

import java.io.File;
import java.io.IOException;

public class Class1 {  // File and IO Stream started today on 14-10-2022.
    
    public static void main(String[] args) {
        
        File f = new File("a.txt");
        
        System.out.println(f.exists());
        
        try {
            f.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println(f.exists());
        
        f.delete();
        
        System.out.println(f.exists());
        
    }

}
