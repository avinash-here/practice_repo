package pack1;

public class One extends Thread{

    @Override
    public void run() {
        System.out.println("Run of One");
    }
    
    @Override
    public synchronized void start() {
        run();
    }
    
    public static void main(String[] args) {
        
        One o = new One();
        Thread t = new Thread(o,"Dhoni");
        
    }
    
}
