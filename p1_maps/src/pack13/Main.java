package pack13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    
    public static void main(String[] args) {
        
        A a1 = new A();
        
        a1.i = 20;
        
        try {
            FileOutputStream fos = new FileOutputStream("file1.txt");
            
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(a1);
            
            System.out.println("Done");
            
        } catch (FileNotFoundException e) {            
            e.printStackTrace();
        } catch (IOException e) {            
            e.printStackTrace();
        }
        
        
    }

}
