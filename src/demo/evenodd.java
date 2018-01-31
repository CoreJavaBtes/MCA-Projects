package demo;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p1 = new Scanner(System.in);
		System.out.println("enter any number");
		int a = p1.nextInt();
		int num = a % 2;
		
		if (num == 0) {
			System.out.println("number is even" + a);
		} else {
			System.out.println("number is odd" + a);
		}

	}
}
