package pack7_revisiting_mt;

public class E extends Thread{

    @Override
    public void run() {
        for(int i = 21; i <= 30; i++) {
            System.out.println("running inside E : " + i);
        }
        System.out.println("End of run of E");
    }
    
}
