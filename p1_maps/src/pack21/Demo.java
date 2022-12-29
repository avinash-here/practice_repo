package pack21;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Demo {
    
    public static void main(String[] args)  {
        
       String s = "100";
       
       int i = Integer.valueOf(s);
       
       System.out.println(i+15);
        
       Consumer<String> c = str -> {System.out.println(str);};
       
       List<String> list = Arrays.asList("Avinash", "Kumar", "Raghav", "Mishra");
       
       list.stream().map((Function<String, Integer>) el -> {
           return 1;
       });
    }

}
