package pack7_revisiting_mt;

public class G implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Inside Run");
        }        
    }
    
    public static void main(String[] args) {
        
        G g = new G();
        Thread t1 = new Thread(g);
        
        t1.start();
        
        for(int i = 0; i < 10; i++) {
            System.out.println("Inside Main");
        }
    }
}
