package PATTERN;

import java.util.Scanner;

public class aaba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sn=new Scanner( System.in);
    int n;
    System.out.println("enter number of rows: ");
    n=sn.nextInt();
    char c;
    for(int i=1;i<=n;++i)
    {
    	c='a';
    	for (int j=i;j<n;++j)
    	{
    		System.out.print(" ");
    	}
    	for(int k=1;k<=i;++k)
    	{
    		System.out.print(c);
    		++c;
    	}
    		c-=2;
    		for(int l=1;l<i;++l)
    		{
    			System.out.print(c);
    			--c;
    		}
    		System.out.println();
    	}
    }
}
