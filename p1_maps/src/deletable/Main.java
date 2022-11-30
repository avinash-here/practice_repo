package deletable;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter the text");
        
        for(int i = 0; i < 91; i++) {
            sc.next();
            String s = sc.next();
            System.out.println(s);
        }
        
    }

}
