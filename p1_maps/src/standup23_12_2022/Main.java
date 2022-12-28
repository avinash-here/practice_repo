package standup23_12_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {
        
        Map<String, Student> map = new LinkedHashMap<>();
        
        map.put("Patna", new Student(56, "Ashish", 668));
        map.put("Mumbai", new Student(56, "Gaurav", 668));
        map.put("Delhi", new Student(56, "Rajesh", 668));
        map.put("Chennai", new Student(56, "Vaibhav", 668));
        map.put("Kolkata", new Student(56, "HariOm", 668));
        
        List<Map.Entry<String, Student>> list = new ArrayList<Map.Entry<String, Student>>(map.entrySet());
        
        for(Map.Entry<String, Student> ent : list)  System.out.println(ent);
        
        System.out.println();
        
        Collections.sort(list, (o1, o2) -> o1.getValue().getName().compareTo(o2.getValue().getName()));
        
        for(Map.Entry<String, Student> ent : list)  System.out.println(ent);
        
        
        
    }
    
}
