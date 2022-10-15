package pack6_serialization;

import java.io.File;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        
        File f = new File("abc");
        
        System.out.println(f);
        
        System.out.println(f.exists());
        
        f.delete();
        
        System.out.println(f.exists());
        
    }

}
