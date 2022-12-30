package multi_thread;

public class Thread1 implements Runnable{
    
    int sum = 0;
    
    @Override
    public void run() {
        
        for(int i = 1; i <= 20; i++) {
            sum += i;
        }
        
    }

}
