package pack11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
     
        List<String> list = Arrays.asList("Anurag", "Badal", "Chandan", "Farhan", "Gaurav");
        
        Stream<String> st = list.stream();
        
        //st.forEach(s -> System.out.println(s.charAt(0)));
        
        st.filter(s -> s.length() == 6).forEach(helicopter -> System.out.println(helicopter));
        
        
        
        
        // There are two kinds of methods that we can call over a stream.
        
        // Intermediate   it will return one more stream in return gift  
        // Terminal       it can be executed only once
                
        
        
    }
}
