package pack1;

public class Two {
    
    public static void main(String[] args) {
        
        One o = new One();
        
        Thread t = new Thread(o);
        
        t.start();
        
    }

}
