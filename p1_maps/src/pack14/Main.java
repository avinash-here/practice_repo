package pack14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
        
        PrintWriter pw = new PrintWriter("myfile2.txt");
        
        
        String str = br.readLine();
                
        while(str != null) {
            System.out.println(str);
            pw.println(str);
            str = br.readLine();
        }         
          
        pw.flush();
        pw.close();
        br.close();            
        
    }

}
