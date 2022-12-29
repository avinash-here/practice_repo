package pack22;

public class Main {
        
    public static void main(String[] args) {
        
        Common c1 = new Common("Vaibhav");
        Common c2 = new Common("Jayesh");
        
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);
        
        t1.start();
        t2.start();
        
        
        
        
    }

}
