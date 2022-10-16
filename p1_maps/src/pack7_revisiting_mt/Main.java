package pack7_revisiting_mt;

public class Main {
    
    public static void main(String[] args) {
        
        // Executing many threads simultaneously
        
        D t1 = new D();
        E t2 = new E();
        F t3 = new F();
        
        t1.start();
        t2.start();
        t3.start();
        
        for(int i = 61; i <= 70; i++) {
            System.out.println("running inside main method : " + i);
        }
        System.out.println("End of the main method");
            
       
        
    }

}
