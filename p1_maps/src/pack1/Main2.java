package pack1;

public class Main2 {
    
    public static void main(String[] args){
        ThreadA ta = new ThreadA();
        ThreadB tb = new ThreadB();

        //synchronized(this){
         ta.start();
         tb.start();
         try {
             ta.wait();
         } catch (InterruptedException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
         try {
             tb.join();
         } catch (InterruptedException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
         //}

        }


}

class ThreadAB extends Thread{

    @Override
    public void run(){
    for(int i=0; i<10; i++)System.out.println(i);
    }

  }

  class ThreadBC extends Thread{

    @Override
    public void run(){
    for(int i=0; i<10; i++)System.out.println(i);
    }

  }

  class Demo{

   public static void main(String[] args){
   ThreadA ta = new ThreadA();
   ThreadB tb = new ThreadB();

   //synchronized(this){
    ta.start();
    tb.start();
    try {
        ta.wait();
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    try {
        tb.join();
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    //}

   }

  }
