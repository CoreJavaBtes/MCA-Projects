package PATTERN;

import java.util.Scanner;

public class cross {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sn=new Scanner(System.in);
    System.out.println("Enter N:");
    int n=sn.nextInt();
    int arr[][]=new int[n][n];
    for(int i=0;i<n;i++)
    {
    	for(int j=0;j<n;j++)
    	{
    		if(i==j||(i+j)==(n-1))
    			System.out.print(arr[i][j]);
    		else
    			System.out.print(" ");
    	}
    	System.out.println("");
    }
	}

}
