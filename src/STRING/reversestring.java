package STRING;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s[] = "i am in btes".split(" ");
     String s1= "";
     for(int i=s.length-1;i>=0;i--)
     {
    	 s1+=s[i]+" ";
     }
     System.out.println(s1);
	}

}