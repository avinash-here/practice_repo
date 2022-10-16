package pack7_revisiting_mt;

public class C extends Thread{

    @Override
    public void run() {

        for(int i = 0; i < 10; i++) {
            System.out.println("Inside run method of C : " + (i+1));
        }
        System.out.println("End of the run method");

    }
    
    public static void main(String[] args) {
        
        Thread t1 = new C();   // This is a thread
        C c1 = new C();        // This is also a thread
        
        c1.start();
        
        for(int i = 10; i < 20; i++) {
            System.out.println("Inside main method : " + (i+1));
        }
        System.out.println("End of main method");
        
        
    }
    
}
