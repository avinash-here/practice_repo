package pack1;

public class Demo2 {

    public static void main(String[] args)throws Exception {
        threads kh=new threads();
//      threads dh=new threads();
//      threads ro=new threads();
        Thread t1=new Thread(() -> {
            try {
                kh.kohli();
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
        Thread t2=new Thread(() -> {
            try {
                kh.dhoni();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        Thread t3=new Thread(() -> {
                try {
                    kh.rohit();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

        });
        t1.setName("Kohli");
        t1.setName("Dhoni");
        t1.setName("Rohit");
        t2.setPriority(10);
        t3.setPriority(6);
        t1.setPriority(4);
        t2.start();
        t3.start();
        t1.start();
        //System.out.println("bdhj");
    }

}

class threads{
    public synchronized void dhoni() throws InterruptedException {
        wait();
        for(int i=1; i<=20; i++) {
               System.out.println(i+i);
           }
    }
    public synchronized void rohit() throws InterruptedException {
        notify();
        wait();
        int sum=1;
        for(int i=1; i<=10; i++) {
               System.out.println(sum*=i);
           }
    }
    public synchronized void kohli() throws InterruptedException {
        notify();
        for(int i=1; i<=10; i++) {
               System.out.println(i);
           }
    }
    
}
