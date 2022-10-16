package pack7_revisiting_mt;

public class D extends Thread{

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("running inside D : " + i);
        }
        System.out.println("End of run of D");
    }
    
}
