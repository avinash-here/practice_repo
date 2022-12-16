package pack19;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your name");
        String name = sc.next();
        
        System.out.println("Enter your age");
        int age = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter a description");
        
        String desc2 = sc.nextLine();
        
        System.out.println(name + "  " + age  + "  " +  desc2);
        
        // Avinash
        // 25
        // desc
        
        
        
    }
    
}
