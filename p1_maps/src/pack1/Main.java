package pack1;

public class Main {

    public static void main(String[] args) {
        
        KohliThread k = new KohliThread();
          k.rt = new RohitThread();
          RohitThread r = new RohitThread();
            r.dh = new DhoniThread();
        
             k.rt.setName("Rohit");
         
            r.dh.setName("Dhoni");
            
              k.setName("Kholi");
           
            
            
            r.dh.setPriority(10);
            
         r.dh.start();
         k.rt.start();
            k.start();
        
        
         
         

    }

}

class DhoniThread extends Thread{
    
    
     int sum  = 0;
     @Override
    public void run() {
         
        
        
        for(int i = 1; i <= 20; i++) {
             sum += i;
        }
        
         System.out.println("Addition of first 20 Number is :"+ sum);
        
    }
    
       
}

class KohliThread extends Thread{
    static Thread rt;
    @Override
    public void run() {
        
        try {
            rt.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for(int i = 1; i <= 10; i++) {
             System.out.println(i);
        }
    }
}

class RohitThread extends Thread{
    
    static Thread dh;
    int total = 1;
    @Override
    public void run() {
          try {
              dh.join();
          }
          catch(InterruptedException e ) {
              
          }
        for(int i = 1; i<= 10; i++) {
            total = total *i;
        }
        
        System.out.println("Product of first 10 number is :" + total);
    }
}
