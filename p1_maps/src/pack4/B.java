package pack4;

public class B {
    
    public static void main(String[] args) {
        
        A a = new A();
        Thread t1 = new Thread(a);
        
        t1.start();
        
        for(int i = 0; i < 10; i++) {
            System.out.println("Inside main method of Class B");
        }
        
    }

}
