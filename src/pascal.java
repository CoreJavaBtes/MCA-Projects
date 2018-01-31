import java.util.Scanner;

public class pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int r,i,k,num=1,j;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter numbe of rows: ");
    r=scan.nextInt();
    for(i=0;i<r;i++)
    {
    	for(k=r;k<i;k--)
    	{
    		System.out.print(" ");
    	}
    	num=1;
    	for(j=0;j<=i;j++)
    	{
    	System.out.print(num+"");
    	num=num*(i-j)/(j+1);
    }
    	System.out.println();
	}

	}
}
