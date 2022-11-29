package pack13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo {
    
    public static void main(String[] args) {
        
        FileInputStream fis;
        try {
            fis = new FileInputStream("file1.txt");
            
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Object obj = ois.readObject();
            
            ((A)obj).anything();
            
        } catch (FileNotFoundException e) {            
            e.printStackTrace();
        } catch (IOException e) {            
            e.printStackTrace();
        } catch (ClassNotFoundException e) {            
            e.printStackTrace();
        }
        
        
        
    }

}
