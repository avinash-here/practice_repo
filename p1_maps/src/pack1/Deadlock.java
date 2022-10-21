package pack1;

public class Deadlock {

    static Object i1=new Object();
    static Object i2=new Object();
    private int i;
   
    static class Thread1 extends Thread{
           
        @Override
        public void run() {
            synchronized (i1) {
               System.out.println("Thread1 have the lock 1");
               
               try {
                   Thread.sleep(1000);
               } catch (Exception e) {
                   System.out.println("Thread1 is waiting for lock 2");
                   // TODO: handle exception
                   
                   synchronized (i2) {
                       System.out.println("Thread2 have the lock 1 and 2");
                   }
               }
           }
        }
        
    }
    
    static class Thread2 extends Thread{
        @Override
        public void run() {
            synchronized (i2) {
               System.out.println("Thread1 have the lock2");
               
               try {
                   
                   Thread.sleep(100);
               } catch (Exception e) {
                   System.out.println("Thread1 is waiting for the lock1");
                   // TODO: handle exception
                   synchronized (i2) {
                       System.out.println("Thread2 have the lock 1 and 2");
                   }
               }
           }
        }
    }
    public static void main(String[] args) {
       Thread1 t1=new Thread1();
       Thread2 t2=new Thread2();
       t1.start();
       t2.start();
   }
}

