package demo;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sn=new Scanner(System.in);
     System.out.println("WELCOME TO ATM");
     int blnc1 = 0;
     int n=9197;
     System.out.println("Enter your PIN");
     int var=sn.nextInt();
     if(var==n)
     {
    	 System.out.println("Your PIN is match");
     }
     else
     {
    	 System.out.println("Your PIN is not Match");
     }
     System.out.println("press 1 for BALANCE ENQUIRY");
     System.out.println("press 2 for WITHDRAWAL");
     System.out.println("press 3 for DEPOSIT");
     System.out.println("press 4 for EXIT");
     int a=sn.nextInt();
     switch(a)
     {
     case 1:
    	 int blnc=1000000;
    	 System.out.println("Your Account Balance is :"+blnc);
    	 System.out.println(" ");
    	 break;
     case 2:
    	 int wid=10000;
    	 System.out.println("Transection will proceed :"+wid);
    	 wid = sn.nextInt();
    	 if (blnc1>=wid)
    	 {
    		 blnc1 = blnc1-wid;
     		 System.out.println("Please collect your money");
    	 }
    	 else
    	 {
    		 System.out.println("Insufficient balance");
    	 }
    	 System.out.println(" ");
    	 break;
     case 3:
    	 int dep=20000;
    	 System.out.println("New balance is :"+dep);
    	 dep=sn.nextInt();
    	 blnc1=blnc1+dep;
    	 System.out.println("your money has been successfully depoisit");
    	 System.out.println(" ");
    	 break;
     case 4 :
    	 System.out.println("EXIT");
     }
     
     
	}

}
