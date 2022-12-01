package pack15;

public class ProducerThread extends Thread{
    
    Common c;
    
    public ProducerThread(Common c) {
        this.c = c;
    }    
    
    @Override
    public void run() {
        
        int i = 0;
        while(true) {
            c.produce(i);
            i = i+1;
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }

}
