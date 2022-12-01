package pack17;

public class Main {
    
public static void main(String[] args) throws InterruptedException {
        
        PD pd = new PD();
        
        Thread ta = new Thread(new Runnable() {
            
            @Override
            public void run() {
                
                pd.produce();
                
            }
        });
        
        Thread tb = new Thread(new Runnable() {
            
            @Override
            public void run() {
                
                pd.consume();
                
            }
        });

        ta.start();
        tb.start();
        
        ta.join();
        tb.join();
    }


}
