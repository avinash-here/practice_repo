package multi_thread;

import java.util.List;
import java.util.Scanner;

public class ThreadA implements Runnable{
    
    List<String> str;
    
    public ThreadA(List<String> str) {
        this.str = str;
    }

    @Override
    public void run() {

        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 4; i++) {
            System.out.println("Enter the city Name");
            String s = sc.nextLine();
            System.out.println();
            str.add(s);            
        }
        
    }

}
