package array;

public class smallelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr=new int[] {34,56,78,90,12,23,45,56};
    int smallest=arr[0];
    for(int i=1;i<arr.length;i++)
    {
    	if(arr[i]<smallest)
    	smallest=arr[i];
    }
    System.out.println("Smallest number is :"+smallest);
	}

}
