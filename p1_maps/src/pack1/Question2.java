package pack1;

public class Question2 {

    boolean is = false;
    int product = 1;
    public static void main(String[] args) {
        Question2 q = new Question2();
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
              q.calculate();                
            }
            
        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    q.print();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }
            
        });
        
        t2.start();
        t1.start();
    }
    
    int calculate() {
        synchronized(this) {
            for(int i=1; i<=10; i++) {
                product = product * i;
            }
            is = true;
            notify();
        }
        return product;
    }
    
    public void print() throws InterruptedException {
        synchronized(this) {
            while(!is) {
                System.out.println("Waiting");
                wait();
            }
        }
        System.out.println("Printing");     
        System.out.println(product);


    }
}
