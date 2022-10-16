package pack7_revisiting_mt;

public class Main extends Thread{
    
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
