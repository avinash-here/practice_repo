package multi_thread;

public class Main {
    
    public static void fun() {
        System.out.println("This is the static method");
    }
    
    public static void main(String[] args) {
        
        Thread1 thread = new Thread1();
        Thread t1 = new Thread(thread);

        Thread2 th2 = new Thread2(thread);
        Thread t2 = new Thread(th2);
        
        t1.start();
        
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        t2.start();
        
        System.out.println(thread.sum);
        
        
        
    }

}
