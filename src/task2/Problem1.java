package task2;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number");
		 int num = sc.nextInt();
		 if(num % 5==0) {
			 System.out.println("Java Training");
		 }
		 else if(num % 3==0) {
			 System.out.println("Consultadd");
		 }
		 else if(num % 3==0 && num % 5==0) {
			 System.out.println("“Consultadd JAVA Training”");
		 }
		 
		 
		
	}
}
