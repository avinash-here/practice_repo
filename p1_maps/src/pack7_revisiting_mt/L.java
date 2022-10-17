package pack7_revisiting_mt;

public class L {
    //A a1 = new A();
    
    void fun(String name) {
        synchronized (A.class) {
            System.out.println("Welcome");        
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }        
            System.out.println(name);
        }
        
    }

}
