package pack17;

import java.util.LinkedList;

public class PD {
    
    LinkedList<Integer> list = new LinkedList<>();
    int cap = 2;
    
    public void produce () {
        int val =0;
        while(true) {
            
            synchronized (this) {
                while(list.size()==cap)
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                System.out.println("Producer Produced: "+val);
                
                list.add(val++);
                
                notify();
                
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void consume() {
        
        while(true) {
            synchronized (this) {
                while(list.size()==0)
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                
                int newval = list.removeFirst();
                
                System.out.println("Consumer Calculated  Sum is: "+newval);
                
                notify();
                
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

}
