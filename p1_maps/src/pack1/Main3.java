package pack1;

public class Main3 {
    
    public synchronized void fun() {
        
        synchronized (this) {
            System.out.println("skjd");
            
        }
    }
    
    public static void main(String[] args) {
        
        Thread t1 = new One();
        
        t1.start();
        
    }

}
