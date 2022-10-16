package pack7_revisiting_mt;

public class J implements Runnable{

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i = 0; i < 5; i++)
        System.out.println(name + " is running"); 
        System.out.println("Priority of " + name + " is " + Thread.currentThread().getPriority());
    }
    
}
