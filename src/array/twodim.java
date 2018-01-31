package array;

import java.util.Scanner;

public class twodim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[][] = new int[3][3];
    Scanner sn = new Scanner(System.in);
    System.out.println("Enter array");
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr.length;j++)
    	{
    		arr[i][j]=sn.nextInt();
    	}
    }
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr[i].length;j++)
    	{
    		System.out.print(arr[i][j]+"\t");
    	}
    	System.out.println("");
    }
	}

}
