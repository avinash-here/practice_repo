package pack21;

public class FunB implements Runnable{
    
    A a1;
    
    public FunB(A a1) {
        this.a1 = a1;
    }    

    @Override
    public void run() {
        a1.funB();        
    }

}
