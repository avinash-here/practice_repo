package multi_thread;

public class Thread2 implements Runnable{
    
    Thread1 t1;
    
    public Thread2(Thread1 t1) {
        this.t1 = t1;        
    }

    @Override
    public void run() {
        System.out.println(t1.sum);
        
    }

}
