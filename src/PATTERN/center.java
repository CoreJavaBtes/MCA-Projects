package PATTERN;

public class center {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,j,k;
		    System.out.println("enter number of rows :");
		    for(i=0;i<=5;i++)
		    {
		    	for(j=4;j>=i;j--)
		    	{
		    		System.out.print(" ");
		    	}
		    for(k=1;k<=(2*i-1);k++) 
		    	{
		    	System.out.print("*");	
		    	}
		    	System.out.println();
		    }
			}

		}