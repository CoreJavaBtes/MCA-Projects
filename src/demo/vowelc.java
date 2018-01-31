package demo;

import java.util.Scanner;

public class vowelc {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub*
      Scanner v1= new Scanner(System.in);
      System.out.println("Enter a Character : ");
      int i=0;
      char ch=v1.next().charAt(0);
      switch(ch)
      {
       case 'a'  :
       case 'e'  :
       case 'i'   :
       case 'o'  :
       case 'u'  :
       case  'A' :
       case 'E'  :
       case 'I'   :
       case 'O'  :
       case 'U'  :i++;
       }
      if(i==1)
    	  System.out.println("Eneterd Character "+ch+" is Vowel");
      else
    	  if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
    		System.out.println("Entered Character "+ch+" is Consonent");
    	  else
    		  System.out.println("Not an Alphabet");
	}

}
