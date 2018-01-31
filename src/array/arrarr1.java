package array;

import java.util.Scanner;

public class arrarr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    int[] arr=new int[10];
    int[] arr1={4,3,2,1,4};
    System.out.println("Enter any 10 numbers");
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=scan.nextInt();
    }
    for(int i=0;i<arr.length;i++) 
    {
    System.out.println("element in array :"+arr[i]);
    }
    for(int var:arr1)
    {
    	System.out.println(var);
    }
	}
	}
