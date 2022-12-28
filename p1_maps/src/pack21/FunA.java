package pack21;

public class FunA implements Runnable{

    @Override
    public void run() {
        
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        A.funA();        
    }

}
