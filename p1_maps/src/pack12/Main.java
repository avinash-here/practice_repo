package pack12;

public class Main {
    
    public static void main(String[] args) {
        
        ThreeadA ta = new ThreeadA();
                
        Thread t1 = new Thread(ta);
        Thread t2 = new Thread(ta);
        
        t1.setName("Albert");
        t2.setName("Lohit");
        
        t1.setPriority(8);
        
        t1.start();
        t2.start();
        
        //for(int i = 0; i < 5; i++)
        System.out.println("Inside main method of Main Class");                
        
    }   

}
