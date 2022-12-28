package extracting_submission_time;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 84; i++) {
			String s = sc.nextLine();
			String[] arr = s.split(" ");
			System.out.println(arr[1]);
		}
		
	}
	

}
