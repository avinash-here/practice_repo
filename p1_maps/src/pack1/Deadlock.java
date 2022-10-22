package pack1;

public class Deadlock{
    public static void main(String[] args) {
        String r1 = "Abhishek";
        String r2 = "Bhandari";
        
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (r1) {
                    System.out.println("Thread 1");
                    try {
                        Thread.sleep(1000);
                    }
                    catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e);
                    }
                }
                synchronized (r2) {
                    System.out.println("Thread 2");
                    try {
                        Thread.sleep(1000);
                    }
                    catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e);
                    }
                }
            }
        };
        
        Thread t2 = new Thread() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                synchronized (r2) {
                    System.out.println("Thread 2");
                    try {
                        Thread.sleep(1000);
                    }
                    catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e);
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}

