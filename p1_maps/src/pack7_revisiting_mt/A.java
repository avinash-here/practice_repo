package pack7_revisiting_mt;

public class A implements Runnable{

    // There are two ways to implement threads in Java.
    // One is by implementing Runnable interface and 
    // The other one is by extending Thread class.
    // Here Class A is implementing Runnable interface and 
    // the class B in the same package is extending the Thread class.
    
    // Internally Thread class also implements the Runnable interface 
    // with the empty implementation of run() method.
    
    @Override
    public void run() {
        // TODO Auto-generated method stub        
    }
    
    

}
