package pack1;

public class Example {

    public static void main(String[] args) {
        String name1 = "Abhijeet";
        String name2 = "Asutosh";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (name1) {
                    System.out.println("Thread 1: lock 1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                    synchronized (name2) {
                        System.out.println("Thread 1: lock 2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (name1) {
                    System.out.println("Thread 2: lock 2");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                    synchronized (name2) {
                        System.out.println("Thread 2: lock 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}