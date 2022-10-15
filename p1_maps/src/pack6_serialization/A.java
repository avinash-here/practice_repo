package pack6_serialization;

import java.io.Serializable;

public class A implements Serializable{
    
    int i = 10;
    
    public void fun() {
        System.out.println("inside fun of class A");
    }

}
