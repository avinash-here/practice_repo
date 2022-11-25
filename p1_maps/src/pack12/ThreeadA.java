package pack12;

public class ThreeadA implements Runnable{

    @Override
    public void run() {
        System.out.println("HI Jayesh" + Thread.currentThread().getName());        
    }    

}
