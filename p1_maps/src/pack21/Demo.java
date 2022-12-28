package pack21;

import java.sql.SQLException;

public class Demo {
    
    // Syntactical     Logical;
    
    public static void main(String[] args)  {
        
        String s = "Vishal";
        
        try {
            s.substring(0, 4);
            System.out.println("this is the try block");
        }catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("This is the catch block");
        }finally {
            System.out.println("This is the finally block");
        }
        
        
        
        
        
    }

}
