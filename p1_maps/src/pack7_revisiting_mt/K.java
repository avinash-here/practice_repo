package pack7_revisiting_mt;

public class K implements Runnable{
    
    int sum;
    
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }             
    }

}
