package pack20;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {
        
        Map<String, Student> map = new HashMap<>();
        
        map.put("Patna", new Student(54, "Raghav", "raghav@gmail", 549));
        map.put("Varanasi", new Student(54, "Shiva", "raghav@gmail", 549));
        map.put("Mumbai", new Student(54, "Sameer", "raghav@gmail", 549));
        map.put("Chennai", new Student(54, "VenuGopal", "raghav@gmail", 549));
        map.put("Kolkata", new Student(54, "Jogesh", "raghav@gmail", 549));
        
        
        Collections.sort(null, null);
        
        
        System.out.println(map);
        
    }

}
