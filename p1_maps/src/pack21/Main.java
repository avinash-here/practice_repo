package pack21;

public class Main {
    
    public static void main(String[] args) {
        
//        FunA fa = new FunA();
//        FunB fb = new FunB(new A());
        
        //Runnable r = A::funA;
        
        Thread ta = new Thread(A::funA);
        Thread tb = new Thread(new A()::funB);
        
        ta.setName("Dhoni");
        tb.setName("Kohli");
        
        ta.start();
        tb.start();
        
        
    }

}
