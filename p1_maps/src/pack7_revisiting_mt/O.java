package pack7_revisiting_mt;

public class O implements Runnable{

    private int c = 0;
    
    public void inc() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {           
            e.printStackTrace();
        }
        c++;
    }
    
    public void dec() {
        c--;
    }
    
    public int getC() {
        return c;
    }    
    
    @Override
    public void run() {
        
        synchronized (this) {
         // increment
            this.inc();
            System.out.println("Value of " + Thread.currentThread().getName() + " after increament is " + getC());
            
            //decrement
            this.dec();
            System.out.println("Value of " + Thread.currentThread().getName() + " after decrement is " + getC());
        }       
    }
}
