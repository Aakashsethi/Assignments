package task3;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); 
		int sum = 0; 
		int avg = 0;
		for (int i = 0; i < 10; i += 1){ 
			sum += input.nextInt(); 
		} 
		System.out.println("The total sum is: " + sum ); 
		avg = sum/10;
		System.out.println("The total average is " + avg ); 

	}

}
