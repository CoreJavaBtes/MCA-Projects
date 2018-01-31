package PATTERN;

public class righttriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,j,k=8;
		    for(i=0;i<=4;i++)
		    {
		    	for(j=0;j<k;j++)
		    	{
		    		System.out.print(" ");
		    	}
		    	k=k-2;
		    	for(j=1;j<=i;j++)
		    	{
		    		System.out.print(" *");
		    	}
		    	System.out.println("");
			}

		}
	}


