package pack7_revisiting_mt;

public class F extends Thread{

    @Override
    public void run() {
        for(int i = 41; i <= 50; i++) {
            System.out.println("running inside F : " + i);
        }
        System.out.println("End of run of F");
    }
    
}
