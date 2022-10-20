package pack8_deadlock;

public class A {
    
//    private transient String a;
    
    public synchronized void funA(B b1) {
        System.out.println("FunA of ClassA starts");
        
        b1.fun2();
        
        System.out.println("FunA of ClassA ends");
    }
    
    public synchronized void fun1() {
        System.out.println("Inside fun1 of Class A");
    }

}
