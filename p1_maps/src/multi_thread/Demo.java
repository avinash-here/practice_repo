package multi_thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    
    public static void main(String[] args) {
   
        List<String> l = Arrays.asList("Avi", "Vishal", "Rajesh", "Ghora", "Viky");
        
        List<String> revised = l.stream().filter(s -> s.length()%2  == 0).map(s -> s.toUpperCase()).collect(Collectors.toList());
        
        revised.forEach(s -> System.out.println(s));
    }

}
