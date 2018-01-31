package PATTERN;

import java.util.Scanner;

public class sevenreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sn = new Scanner(System.in);
    System.out.println("Enter no of rows :");
    int rows=sn.nextInt();
    System.out.println("Pattern is :");
    for(int i=rows;i>=1;i--)
    {
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print(j+"");
    	}
    	System.out.println();
    }
    for(int i=2;i<=rows;i++)
    {
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print(j+ "");
    	}
    	System.out.println();
    }
    sn.close();
	}

}
