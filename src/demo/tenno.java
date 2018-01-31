package demo;

import java.util.Scanner;

public class tenno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sn=new Scanner (System.in);
System.out.println("enter 10 numbers");
int sum = 0;
for(int i=0;i<10;i++) 
{
int a= sn.nextInt();
sum = sum+a;
}
	System.out.println(sum);

	
	}

}
