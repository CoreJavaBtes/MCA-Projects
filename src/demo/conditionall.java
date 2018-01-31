package demo;

import java.util.Scanner;

public class conditionall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner p1 = new Scanner(System.in);
System.out.println("enter three numbers");
int a = p1.nextInt();
int b= p1.nextInt();
int c= p1.nextInt();
int var =(a>b) ? (a>c) ? (a) : (c) : (b>c) ? (b) : (c); 

System.out.println("greatest number is::"+var);
	}

}
