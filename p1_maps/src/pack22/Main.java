package pack22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import standup23_12_2022.Student;

public class Main {
        
    public static void main(String[] args) {
        
        Common c1 = new Common("Vaibhav");
        Common c2 = new Common("Jayesh");
        
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);
        
        //t1.start();
        //t2.start();
        
        List<String> list=new ArrayList<>();
        list.add("Sanket");
        list.add("Suresh");
        list.add("Ramesh");
        list.add("Mahesh");
        list.add("Tillu");
        list.add("Sonu");
        list.add("Mahakal");
        list.add("Mahantesh");
        list.add("Prakash");
        list.add("Prabhu");
        
        List<String> filteredList = list.stream().filter(i-> i.length()%2==0).collect(Collectors.toList());
        
        filteredList.forEach(s -> System.out.println(s));
        
        
        
        
    }

}
