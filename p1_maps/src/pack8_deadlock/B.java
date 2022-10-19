package pack8_deadlock;

public class B {
    
    public synchronized void funB(A a1) {
        System.out.println("FunB of ClassB starts");
        
        a1.fun1();
        
        System.out.println("FunB of ClassB ends");
    }
    
    public synchronized void fun2() {
        System.out.println("Inside fun2 of Class B");
    }


}
