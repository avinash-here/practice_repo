package pack13;

import java.io.Serializable;

public class A implements Serializable{
    
    int i = 10;
    
    public void anything() {
        System.out.println("Inside anything of class A");
        System.out.println(i);
    }

}
