package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B {
    
    // "Collections" is a class in java.util package that has some static methods we can use on collection of objects.
    
    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<>();
        arr.add(9);arr.add(5);
        arr.add(5);
        arr.add(2);arr.add(5);
        arr.add(6);
        arr.add(3);arr.add(5);
        
        System.out.println(arr);            // Expected Output: [9, 5, 2, 6, 3]        
        Collections.reverse(arr);           // reverse method
        System.out.println(arr);            // Expected Output: [3, 6, 2, 5, 9]
        Collections.replaceAll(arr, 5, 0);  //
        System.out.println(arr);
        
        List<List<Integer>> list = new ArrayList<>();
        System.out.println(list);
        char a = 'a';
        char b = 'b';
        if(a<b) System.out.println("a");
    }

}
