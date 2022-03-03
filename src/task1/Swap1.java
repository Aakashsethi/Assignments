package task1;

import java.util.Scanner;

public class Swap1 {
	
	public static void main(String[] args) {
		int a=100;
		int b=300;
		int temp;
		System.out.println("a ="+a+"b =" +b);
		temp =a;
		a=b;
		b=temp;
		System.out.println("new a ="+a+ "new b =" +b);
		//without a temp variable
		a =a+b;
		b= a-b;
		a=a-b;
		System.out.println("new a without temp variable when a=>300 =  "+a+" new b without temp variable when b=>100 =" +b);
		try (///Taking value from user
		Scanner in = new Scanner(System.in)) {
			int num1 =in.nextInt();
			int num2 =in.nextInt();
			//
			temp= num1+num2;
		}
		System.out.println("result temp"+temp);;
	
	}

}
