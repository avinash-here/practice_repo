package pack10;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    
    public static void main(String[] args) {
        
        // Collection Framework  
        // Collection  ->   List          Set               Queue
        //                  ArrayList     HashSet           PriorityQueue
        //                  LinkedList    LinkedHashSet     ArrayDeque
        //                  Vector        TreeSet
        //                  Stack
        
        
        Set<Employee> set = new TreeSet<>();
        
        set.add(new Employee(1, "Parimal", "Lucknow", 40000));
        set.add(new Employee(2, "Avinash", "Mumbai", 30000));
        set.add(new Employee(3, "Bablu", "Delhi", 45000));
        set.add(new Employee(4, "Vishal", "Chennai", 50000));
        set.add(new Employee(5, "Mustafeez", "Patna", 22000));
        
        System.out.println(set);
        
        
    }

}
