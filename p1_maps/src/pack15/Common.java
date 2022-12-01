package pack15;

public class Common {
    
    int value;
    
    boolean flag = true;
    
    public synchronized void produce(int i) {
        
        if(flag) {
            value = i;
            System.out.println("Producer produces: " + i);
            flag = false;
            
            this.notify();
            
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        
    }
    
    public synchronized int consume() {
        
        if(flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
                      
        flag = true;
//        int sum = 0;
//        for(int i = 0; i <= value; i++) sum += i;
//        System.out.println("Consumer consumes: " + sum);
        this.notify();
        return value;
        
    }

}
