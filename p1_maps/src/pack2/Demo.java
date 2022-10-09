package pack2;

public class Demo {
    
    public static void main(String[] args) {
        
        Inter i1 = new InterImpl();     // This is the external class implementation.   
        i1.hello("Akshay");
        
        Inter i2 = new Inter() {        // This is the anonymous inner class.
            @Override
            public void hello(String str) {
                System.out.println("Welcome " + str);
            }            
        };
        i2.hello("Aman");
        
        Inter i3 = str -> System.out.println("Morning " + str);  // This is the Lambda Expression. 
        i3.hello("Raghav");
        
        
    }

}
