package pack7_revisiting_mt;

public class Hi implements Runnable{

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i = 0; i < 10; i++) {
            System.out.println(name + " is running");   
        }                 
    }
   
}
