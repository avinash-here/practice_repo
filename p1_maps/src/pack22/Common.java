package pack22;

public class Common implements Runnable{

    String name;
    
    public Common(String name){
        this.name = name;
    }
    
    @Override
    public synchronized void run() {
        
        System.out.println("Hello");
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println(name);
        
    }

}
