package pack3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassOne {
    
    public static void main(String[] args) {
        
        // java.util.Collections class
        
        List<String> colors = Arrays.asList("white", "red", "yellow", "pink", "red");
        
//        int res = Collections.frequency(colors, "while");
        
        System.out.println(Collections.frequency(colors, "while"));    // frequency method
        System.out.println(Collections.frequency(colors, "white"));
        System.out.println(Collections.frequency(colors, "red"));
        
        Collections.sort(colors);                                      // sort method
        
        System.out.println(colors);
        
        List<Student> students = new ArrayList<>();
        
        students.add(new Student("Aman", 10, 320));
        students.add(new Student("Akshay", 12, 420));
        students.add(new Student("Raghav", 23, 650));
        students.add(new Student("Vikas", 56, 210));
        students.add(new Student("Pradeep", 32, 560));
        
        Collections.sort(students);                            // to sort a user-defined object, it must be comparable
        
        System.out.println(students);
    }

}
