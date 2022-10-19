package pack8_deadlock;

public class Main {
    
    public static void main(String[] args) {
        
        A a1 = new A();
        B b1 = new B();
        
        Thread t1 = new ThreadA(a1, b1);
        Thread t2 = new ThreadB(a1, b1);
        
        t1.start();
        t2.start();
        
        
    }

}
