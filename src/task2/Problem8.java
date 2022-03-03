package task2;

import java.util.Scanner;

class userInput{
	
}

public class Problem8 {

	public static void main(String[] args) {
		System.out.println("Enter the value :");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		System.out.println("the value entererd is :" + c );
		
		String conv =String.valueOf(c);
		String str = "random";
		if (conv.contains("random")) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
				
		
	}

}
