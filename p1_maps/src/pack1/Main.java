package pack1;

public class Main {
    public static void main(String[] args) {

        ThreadB t2=new ThreadB();

        ThreadC t3=new ThreadC();
        ThreadA t1=new ThreadA();

        t2.setName("Dhoni");
        t3.setName("Rohit");
        t1.setName("Kohli");

        t2.setPriority(6);
        t3.setPriority(4);
        t1.setPriority(2);

        t2.start();
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        t3.start();
//        try {
//            t3.join();
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        t1.start();

    }
}

class  ThreadA extends Thread{

    @Override
    public void run() {
        System.out.println("Thread->"+Thread.currentThread().getName()+"  is printing 1 to 10");
        for (int i = 1; i <11 ; i++) {
            System.out.println(i);
        }

    }

}

class  ThreadB extends Thread{

    @Override
    public void run() {

        System.out.println("Thread->" + Thread.currentThread().getName() + "  is calculating addition of first 20 number");
        int add = 0;
        for (int i = 1; i < 21; i++) {

            add += i;

        }
        System.out.println(add);
    }

}

class  ThreadC extends Thread{

    @Override
    public void run() {

        System.out.println("Thread->" + Thread.currentThread().getName() + "  is calculating product of first 10 number");
        int pod = 1;
        for (int i = 1; i < 11; i++) {

            pod*= i;

        }
        System.out.println(pod);
    }

}
