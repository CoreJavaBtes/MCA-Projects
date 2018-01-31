package STRING;

import java.util.Scanner;

public class SearchReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner ob= new Scanner(System.in);
    System.out.println("Enter the Sentence: ");
    String s=ob.nextLine();
    System.out.println("Enter the word to be Replaced: ");
    String replace=ob.next();
    System.out.println("Enter the word with which it is replaced: ");
    String replacedwith=ob.next();
    s=s+" ";
    String newsen="";
    String temp="";
    for(int i=0;i<s.length();i++)
    {
    	char x=s.charAt(i);
    	if(x!=' ')
    	{
    		temp=temp+x;
    	}
    	else
    	{
    	if(replace.equals(temp))
    	{
			newsen=newsen+replacedwith;
    	}
    	else
    	{
    		newsen=newsen+temp;
    	}
    	newsen=newsen+" ";
    	temp="";
    	}
    }
    System.out.println("The new sentence is: "+"\n" +newsen);
    }

}
