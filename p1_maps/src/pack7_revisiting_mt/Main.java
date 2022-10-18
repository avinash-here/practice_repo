package pack7_revisiting_mt;

import java.util.Arrays;
import java.util.List;

public class Main extends Thread{
    
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {                
                e.printStackTrace();
            }
        }
        System.out.println("Done!");
    }
    
    public static void main(String[] args) {
        
        // Executing many threads simultaneously
      /*
        D t1 = new D();
        E t2 = new E();
        F t3 = new F();
        
        t1.start();
        t2.start();
        t3.start();
        
        for(int i = 61; i <= 70; i++) {
            System.out.println("running inside main method : " + i);
        }
        System.out.println("End of the main method");
      */
        
      /*
        Thread a = new Thread(new H());
        Thread b = new Thread(new Hi());
        
        a.setName("Ferrari");
        b.setName("Lamberghini");
        
        a.start();
        b.start();
     */
        
      /*
        J j1 = new J();
        Thread t1 = new Thread(j1);
        Thread t2 = new Thread(j1);
        
        t1.setName("Splendor");
        t2.setName("Pulsar");
        
        t1.setPriority(4);
        t2.setPriority(6);
        
        t1.start();
        t2.start();
      */
        
      /*
        Main m1 = new Main();
        Main m2 = new Main();
        Main m3 = new Main();
             
        System.out.println("Priority of t1 : " + m1.getPriority());
        System.out.println("Priority of t2 : " + m2.getPriority());
        System.out.println("Priority of t3 : " + m3.getPriority());
        
        m1.setPriority(2);
        m2.setPriority(5);
        m3.setPriority(8);
        
        System.out.println("Priority of t1 : " + m1.getPriority());
        System.out.println("Priority of t2 : " + m2.getPriority());
        System.out.println("Priority of t3 : " + m3.getPriority());
        
        System.out.println("Current Running Thread : " + Thread.currentThread().getName());
        System.out.println("Main method Priotrity : " + Thread.currentThread().getPriority());
        
        Thread.currentThread().setPriority(10);
        
        System.out.println("Main method Priority : " + Thread.currentThread().getPriority());
      */
        
       /*
        Main m2 = new Main();
        
        m2.start();
       
        for(int i = 0; i < 5; i++)
        System.out.println("End of main " + (i+1));
      */
        
      /*  Join method
        K k = new K();
        
        Thread t = new Thread(k);
        
        t.start();
        
        try {
            t.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("The value of sum is " + k.sum);
      */
        
      /*
        L l1 = new L();
        L l2 = new L();
        
        Thread t1 = new M(l1, "Ram");
        Thread t2 = new N(l2, "Shyam");
       
        t1.start();
        t2.start();
      */
        
        O o = new O();
              
        Thread t1 = new Thread(o, "Dhoni");
        Thread t2 = new Thread(o, "Kohli");
        Thread t3 = new Thread(o, "Rohit");
        
        t1.start();  t2.start();  t3.start();
        
        
        
        
        
        
        
        
        
        
    }

}
