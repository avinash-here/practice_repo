package pack15;

public class ConsumerThread extends Thread{
    
    Common c;
    
    public ConsumerThread(Common c) {
        this.c = c;
    }
    
    int sum = 0;
    
    @Override
    public void run() {
        
        while(true) {
            int i = c.consume(); 
            sum += i;
            
            System.out.println("Consumer calculated: " + sum);
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        
    }

}
